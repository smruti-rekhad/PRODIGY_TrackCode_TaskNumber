public class QuickSort {


    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Selecting pivot as the last element
        int i = low - 1; // Index for smaller element

        for (int j = low; j < high; j++) {
            // If current element is less than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

     
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the partitioning index
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
