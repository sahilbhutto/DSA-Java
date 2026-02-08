package sorting;

/**

 * Algorithm: Bubble Sort
 * Description: Repeatedly compares adjacent elements and swaps them if they are in the
 * wrong order.

 * Best Case: O(n)
 * Average Case: O(n²)
 * Worst Case: O(n²)

 * Space Complexity: O(1)
 * Stable: Yes
 * In-place: Yes

 **/

public class BubbleSort{

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            boolean isSwap = false; // To track if array is sorted or not
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwap = true;
                }
            }

            if(!isSwap){ // Array is already sorted
                return;
            }

        }

    }

    public static void main(String[] args) {
       int[] arr = {4,3,5,2,1};

       bubbleSort(arr);

       for(int x: arr){
           System.out.print(x + " ");
       }

    }
}