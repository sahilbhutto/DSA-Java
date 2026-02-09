package sorting;

/**
 * Algorithm: Insertion Sort
 * Description: Builds the sorted array one element at a time by repeatedly taking the next
   element from the unsorted part and inserting it into its correct position
   in the already sorted part (similar to sorting playing cards in hand).

 * Best Case: O(n)        // when the array is already sorted
 * Average Case: O(n²)
 * Worst Case: O(n²)     // when the array is sorted in reverse order

 * Space Complexity: O(1)
 * Stable: Yes
 * In-place: Yes
 */

public class InsertionSort {

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i=1; i<n; i++){
            int curr = arr[i];
            int prev = i-1;

            while (prev>= 0 && arr[prev]>curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};

        insertionSort(arr);

        for(int x: arr){
            System.out.print(x + " ");
        }

    }
}
