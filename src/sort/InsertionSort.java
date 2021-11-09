/**
 * Time complexity of bubble sort are :
 * Best Case:O(n),
 * Average Case:O(n^2),
 * Worst Case:O(n^2)
 **/

package sort;

public class InsertionSort {

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public void print(int[] arr) {
        System.out.println("Elements after sort");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String args[]) {
        int[] arr = {3, 10, 4, 20, 11, 6, 2, 36, 22};
        InsertionSort si = new InsertionSort();
        si.sort(arr);
        si.print(arr);

    }
}
