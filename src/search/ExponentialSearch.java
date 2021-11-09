package search;

import java.util.Arrays;

public class ExponentialSearch {

    public int exponentialSearch(int[] a, int n, int x) {
        if (a[0] == x) {
            return 0;
        }

        int i = 1;
        while (i < n && x <= a[i]) {
            i = i * 2;
        }

        return Arrays.binarySearch(a, i / 2, Math.min(i, n - 1), x);
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        ExponentialSearch exponentialSearch = new ExponentialSearch();
        int result = exponentialSearch.exponentialSearch(arr,
                arr.length, x);

      System.out.println(result);
    }
}
