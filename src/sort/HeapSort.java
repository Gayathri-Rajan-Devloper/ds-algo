/**
 * Time complexity of heap sort are :
 * Best Case:O(nlogn),
 * Average Case:O(nlogn),
 * Worst Case:O(nlogn)
 **/

package sort;

public class HeapSort {

    public void sort(int[] arr) {
        int n = arr.length;
        //to take the last non-leaf node and apply heapify method on it
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        //To remove element and sort them by swapping the first element  with last element
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    private void heapify(int[] arr, int n, int i) {

        int largest = i;
        int l = 2 * i + 1;  //left child
        int r = 2 * i + 2;  //right child

        //check if left child is largest then current node i.e largest
        //if it largest then assign left child to largest
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        //check if right child is largest then current node i.e largest
        //if it largest then assign right child to largest
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println("Sorted array is ");
        heapSort.printArray(arr);

    }

}
