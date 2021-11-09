/**
 * Time complexity of merge sort are :
 * Best Case:O(nlogn),
 * Average Case:O(nlogn),
 * Worst Case:O(nlogn)
 **/

package sort;

public class MergeSort {

    public void mergeSort(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            mergeSort(a, l, mid);
            mergeSort(a, mid + 1, r);
            merge(a, l, mid, r);
        }
    }

    public void merge(int[] a, int l, int mid, int r) {
        int i = l;
        int j = mid + 1;
        int k = l;
        int[] b = new int[a.length];
        while (i <= mid && j <= r) {
            if (a[i] < a[j]) {
                b[k] = a[i];
                i++;
                k++;
            } else {
                b[k] = a[j];
                j++;
                k++;
            }
        }
        if (i > mid) {
            while (j <= r) {
                b[k] = a[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                b[k] = a[i];
                i++;
                k++;
            }
        }
        //Copy all elments from b to a
        for (k = l; k <= r; k++) {
            a[k] = b[k];
        }
    }

    public void print(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {12, 15, 2, 20, 1, 3, 21, 9, 10};

        MergeSort ms = new MergeSort();
        ms.mergeSort(a, 0, a.length - 1);
        ms.print(a);
    }
}


