import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];

        // Input matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        int[][] sum = addMatrices(A, B, rows, cols);
        System.out.println("\nMatrix Addition Result:");
        printMatrix(sum);

        // Matrix Multiplication (only valid if cols of A == rows of B)
        System.out.print("\nEnter number of columns for Matrix B (for multiplication): ");
        int colsB = sc.nextInt();
        int[][] B2 = new int[cols][colsB];

        System.out.println("Enter elements of Matrix B (for multiplication):");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < colsB; j++) {
                B2[i][j] = sc.nextInt();
            }
        }

        int[][] product = multiplyMatrices(A, B2, rows, cols, colsB);
        System.out.println("\nMatrix Multiplication Result:");
        printMatrix(product);
    }

    // Method for addition
    public static int[][] addMatrices(int[][] A, int[][] B, int rows, int cols) {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }
        return result;
    }

    // Method for multiplication
    public static int[][] multiplyMatrices(int[][] A, int[][] B, int rowsA, int colsA, int colsB) {
        int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Method to print matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

