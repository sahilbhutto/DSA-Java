package sorting;

/**
 * Algorithm: Selection Sort
 * Description: Repeatedly selects the minimum element from the unsorted part and places
   it at the beginning.

 * Best Case: O(n²)
 * Average Case: O(n²)
 * Worst Case: O(n²)

 * Space Complexity: O(1)
 * Stable: No
 * In-place: Yes
 */


public class SelectionSort {

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int smallestIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[smallestIndex]){
                    smallestIndex = j;
                }
            }

            if(smallestIndex != i){
                int temp = arr[i];
                arr[i] = arr[smallestIndex];
                arr[smallestIndex] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};

        selectionSort(arr);

        for(int x: arr){
            System.out.print(x + " ");
        }

    }
}
