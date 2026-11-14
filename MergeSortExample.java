public class MergeSortExample {

    // Main function that sorts arr[l..r] using merge()
    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            // 1. DIVIDE: Find the middle point to divide the array into two halves
            int m = l + (r - l) / 2;

            // 2. CONQUER: Recursively sort the first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // 3. COMBINE: Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    // Function to merge two subarrays of arr[]
    public static void merge(int[] arr, int l, int m, int r) {
        // Find sizes of the two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i)
            leftArray[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            rightArray[j] = arr[m + 1 + j];

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray
        int k = l;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[] if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[] if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Original array:");
        printArray(arr);

        sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array:");
        printArray(arr);
    }
}