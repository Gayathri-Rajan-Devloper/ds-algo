/**
 * Time complexity of selection sort are :
 * Best Case:O(n^2),
 * Average Case:O(n^2),
 * Worst Case:O(n^2)
 **/
//The selection sort algorithm sorts an array by repeatedly finding the minimum element
// (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
//1) The subarray which is already sorted.
//2) Remaining subarray which is unsorted.
//In every iteration of selection sort, the minimum element (considering ascending order) from
// the unsorted subarray is picked and moved to the sorted subarray.

package sort;

public class SelectionSort {

    public void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            int min = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < arr[i]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public void print(int[] arr) {
        System.out.print("Elements after sort");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = {3, 10, 4, 20, 11, 6, 2, 36, 22};
        SelectionSort ss = new SelectionSort();
        ss.sort(arr);
        ss.print(arr);

    }
}