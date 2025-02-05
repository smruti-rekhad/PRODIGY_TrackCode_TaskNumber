import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 9}; // Array must be sorted
        int targetVal = 7;

        int result = binarySearch(arr, targetVal);

        if (result != -1) {
            System.out.println("Value " + targetVal + " found at index " + result);
        } else {
            System.out.println("Value " + targetVal + " not found");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
// for finding the mid value 
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // if the target is at mid
            if (arr[mid] == target) {
                return mid;
            }
            // for Searching the left half
            if (target < arr[mid]) {
                right = mid - 1;
            } 
            // for Searching the right half
            else {
                left = mid + 1;
            }
        }

        return -1; // Target not found
    }
}
