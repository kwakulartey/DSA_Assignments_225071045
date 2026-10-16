import java.util.Scanner;

public class SumEvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 1; i <=2 * n; i++) {
            if(i % 2 ==0){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
        }

        System.out.println("Sum of first " + n + " even integers: " + sumEven);
        System.out.println("Sum of first " + n + " odd integers: " + sumOdd);

        input.close();
    }
}

