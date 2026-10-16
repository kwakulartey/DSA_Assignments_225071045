import java.util.Scanner;

public class DigitSumAndCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int inputNumber = scanner.nextInt();

        int num = inputNumber;
        int sumOfDigits = 0;
        int countOfDigits = 0;

        if (num == 0) {
            countOfDigits = 1;
            sumOfDigits = 0;
        } else if (num < 0) {
            while(num !=0){
                int digit = num % 10;
                sumOfDigits += digit;
                countOfDigits++;
                num /= 10;
            }
        }
        else {
            while (num > 0) {
                int digit = num % 10;
                sumOfDigits += digit;
                countOfDigits++;
                num /= 10;
            }
        }

        System.out.println("--- Results ---");
        System.out.println("Input Number: " + inputNumber);
        System.out.println("Total Number of Digits: " + countOfDigits);
        System.out.println("Sum of Digits: " + sumOfDigits);

        scanner.close();
    }
}