/**
 * Time complexity of quick sort are :
 * Best Case:O(nlogn),
 * Average Case:O(nlogn),
 * Worst Case:O(n^2)
 **/


package sort;

public class QuickSort {
    //This function is used to sort the elements based upon pivot element by moving all elements less
    // then pivot to left side and greater then pivot to right side
    public int partition(int[] arr, int lb, int ub) {
        //Intialize pivot as lowerbound
        int pivot = arr[lb];
        int start = lb;
        int end = ub;
        //check is start is less then end
        while (start < end) {
            //increments start pointer only if start is less the pivot element
            while (arr[start] <= pivot) {
                start++;
            }
            //increments end pointer only if end is greater the pivot element
            while (arr[end] > pivot) {
                end--;
            }

            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        if (start > end) {
            int temp = arr[lb];
            arr[lb] = arr[end];
            arr[end] = temp;
        }
        return end;
    }

    public void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int end = partition(a, low, high);
            quickSort(a, low, end - 1);
            quickSort(a, end + 1, high);
        }
    }

    public void print(int[] arr) {
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 1, 2, 9, 16, 11};
        int len = arr.length - 1;
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(arr, 0, len);
        System.out.println("Array after sort");
        quickSort.print(arr);
    }
}
