import java.util.Scanner;

public class factorial {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else
         return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        int result = fact(n);
        System.out.println("Factorial: " + result);

        scanner.close();
    }
}
