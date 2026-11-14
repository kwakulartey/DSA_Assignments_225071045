public class listdata {
    private int[] A;
    private int Size;

    public listdata() {
        A = new int[10];
        Size = 0;
    }

    public boolean isEmpty() {
        return Size == 0;
    }

    public int listSize() {
        return Size;
    }

    public void add(int value) {
        ensureCapacity();
        A[Size] = value;
        Size++;
    }

    public void insert(int index, int value) {
        if (index < 0 || index > Size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + Size);
        }
        ensureCapacity();
        for (int i = Size; i > index; i--) {
            A[i] = A[i - 1];
        }
        A[index] = value;
        Size++;
    }

    public int delete(int index) {
        if (index < 0 || index >= Size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + Size);
        }
        int deletedValue = A[index];
        for (int i = index; i < Size - 1; i++) {
            A[i] = A[i + 1];
        }
        Size--;
        return deletedValue;
    }

    public void output() {
        System.out.print("Numbers in the list: ");
        for (int i = 0; i < Size; i++) {
            System.out.print(A[i] + (i < Size - 1 ? ", " : ""));
        }
        System.out.println();
    }

    private void ensureCapacity() {
        if (Size == A.length) {
            int[] expanded = new int[A.length * 2];
            for (int i = 0; i < A.length; i++) {
                expanded[i] = A[i];
            }
            A = expanded;
        }
    }

    public int get(int index) {
        if (index < 0 || index >= Size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + Size);
        }
        return A[index];
    }

    public int indexof(int value) {
        for (int i = 0; i < Size; i++) {
            if (A[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        listdata list = new listdata();

        for (int number = 1; number <= 10; number++) {
            list.add(number);
        }

        System.out.println("Is the list empty? " + list.isEmpty());
        System.out.println("Size of the list: " + list.listSize());
        list.output();

        list.insert(5, 99);
        System.out.println("After inserting 99 at index 5:");
        list.output();

        int deletedValue = list.delete(5);
        System.out.println("Deleted value at index 5: " + deletedValue);
        System.out.println("After deletion:");
        list.output();
    }
}
