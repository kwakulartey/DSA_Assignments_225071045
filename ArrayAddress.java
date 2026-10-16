import java.util.Scanner;

public class ArrayAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter base address: ");
        int baseAddress = sc.nextInt();

        System.out.print("Enter total number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter total number of columns: ");
        int cols = sc.nextInt();

        System.out.print("Enter word size (in bytes): ");
        int wordSize = sc.nextInt();

        System.out.print("Enter row index: ");
        int i = sc.nextInt();

        System.out.print("Enter column index: ");
        int j = sc.nextInt();

        // Compute address using row-major order
        int address = baseAddress + ((i * cols) + j) * wordSize;

        // Output result
        System.out.println("The address of element at [" + i + "][" + j + "] is: " + address);
    }
}
