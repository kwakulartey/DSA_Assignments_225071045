public class ArrayAddition {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {6, 7, 8, 9, 10};

        int[] C = new int[B.length];

        for (int i = 0; i < B.length; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.print(" Array C: ");
        for (int value : C) {
            System.out.print(value + " ");
        }
    }
}
