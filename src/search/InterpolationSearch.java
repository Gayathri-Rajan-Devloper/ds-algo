package search;

public class InterpolationSearch {

    public int search(int[] a, int l, int h, int x) {
        int pos;
        if (l <= h && x >= a[l] && x <= a[h]) {
            pos = l + ((h - l) / (a[h] - a[l])) * (x - a[l]);

            if (a[pos] == x) {
                return pos;
            }

            if (a[pos] > x) {
                return search(a, l, pos - 1, x);
            }
            if (a[pos] < x) {
                return search(a, pos + 1, h, x);
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        // Array of items on which search will
        // be conducted.
        int arr[] = {10, 12, 13, 16, 18, 19, 20, 21,
                22, 23, 24, 33, 35, 42, 47};

        int n = arr.length;

        // Element to be searched
        int x = 18;
        InterpolationSearch interpolationSearch = new InterpolationSearch();
        int index = interpolationSearch.search(arr, 0, n - 1, x);

        // If element was found
        if (index != -1)
            System.out.println("Element found at index "
                    + index);
        else
            System.out.println("Element not found.");
    }
}
