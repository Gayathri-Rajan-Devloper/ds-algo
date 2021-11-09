/**
 * Time complexity of Linear search are :
 * Best Case:O(1),
 * Average Case:O(n),
 * Worst Case:O(n)
         **/

package search;

public class LinearSearch {

    public int search(int[] a, int key) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 6, 22, 4, 9, 101, 1000, 30};
        LinearSearch ls = new LinearSearch();
        int element = ls.search(arr, 1000);
        System.out.println(element);
    }
}
