public class SinglyLinkedList {

    
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node Head;
    private int size;

   
    public SinglyLinkedList() {
        this.Head = null;
        this.size = 0;
    }

   
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    
    public int listSize() {
        return size;
    }

    
    public int get(int position) {
        Node h = Head;
        int count = 1;
        while (count < position && h != null) {
            h = h.next;
            count++;
        }
        if (h != null) {
            return h.data;
        }
        throw new IndexOutOfBoundsException("Wrong Position");
    }

   
    public int positionOf(int x) {
        Node h = Head;
        int count = 1;
        while (count <= size && h != null) {
            if (h.data == x) {
                return count; 
            }
            h = h.next;
            count++;
        }
        return -1; // Returned if the integer is not found
    }

    
    public void insert(int position, int x) {
        // Validate position bounds (valid positions are from 1 to size + 1)
        if (position < 1 || position > size + 1) {
            throw new IndexOutOfBoundsException("Wrong Position");
        }

        Node N = new Node(x);

       
        if (position == 1) {
            N.next = Head;
            Head = N;
            size++;
        } 
      
        else if (position == (size + 1)) {
            Node h = Head;
            while (h.next != null) {
                h = h.next;
            }
            h.next = N;
            size++;
        } 
        
        else {
            int count = 1;
            Node h = Head;
            while (count < (position - 1)) {
                h = h.next;
                count++;
            }
            N.next = h.next;
            h.next = N;
            size++;
        }
    }

   
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

       
        list.insert(1, 10); 
        list.insert(2, 30);
        list.insert(2, 20); 
        list.insert(1, 5);  

        System.out.println("List Size: " + list.listSize()); // 4
        System.out.println("Element at position 2: " + list.get(2)); 
        System.out.println("Element at position 3: " + list.get(3)); 
        System.out.println("Position of integer 20: " + list.positionOf(20)); 
    }
}