import java.util.ArrayList;
import java.util.Scanner;

public class Arr {
    private int size = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int element = input.nextInt();
            arr.add(element);
        }

        System.out.println("The elements in the array are: " + arr);
    }
    public boolean isEmpty() {
    if (size == 0) {
        return true;
    } else {
        return false;
    }
}
}