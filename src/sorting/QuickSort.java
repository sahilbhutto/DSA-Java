package sorting;

/**
 * Algorithm: Quick Sort
 * Description: Quick Sort is a Divide and Conquer sorting algorithm.
   It selects a pivot element, places it in its correct position,
   and rearranges smaller elements to the left and larger elements to the right.
   Then it recursively sorts the left and right subarrays.

 * Best Case: O(n log n)
 * Average Case: O(n log n)
 * Worst Case: O(n²)

 * Space Complexity: O(log n)  // due to recursion stack
 * Stable: No
 * In-place: Yes
 */

public class QuickSort {

    public static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];     // Choose last element as pivot
        int index = start - 1;    // Smaller element index

        for (int j = start; j < end; j++) {

            if (arr[j] <= pivot) {
                index++;
                swap(arr, j, index);
            }
        }

        index++;
        swap(arr, index, end);

        return index;
    }

    public static void quickSort(int[] arr, int start, int end) {

        if (start < end) {

            int pivotIndex = partition(arr, start, end);

            quickSort(arr, start, pivotIndex - 1);  // Left side
            quickSort(arr, pivotIndex + 1, end);    // Right side
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 5, 2, 1};

        quickSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
