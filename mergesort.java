import java.util.Arrays;

public class Main {

    
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) return; //  recursion function

        int mid = arr.length / 2;

        //  the array is splitted into two parts
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursive sorting
        mergeSort(left);
        mergeSort(right);

        // Merge sorted halves
        merge(arr, left, right);
    }

    // Merge two sorted arrays
    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare and merge elements
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements from left array
        while (i < left.length) arr[k++] = left[i++];

        // Copy remaining elements from right array
        while (j < right.length) arr[k++] = right[j++];
    }

    // Main function to test sorting
    public static void main(String[] args) {
        int[] arr = {9, 3, 7, 5, 6, 2, 8, 1, 4};
        System.out.println("Original Array: " + Arrays.toString(arr));

        mergeSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
