/**
 * Time complexity of bubble sort are :
 * Best Case:O(n),
 * Average Case:O(n^2),
 * Worst Case:O(n^2)
 **/

//Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping
// the adjacent elements if they are in wrong order.
package sort;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 4, 20, 11, 6, 2, 36, 22};
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arr);
        bs.print(arr);
    }

}

