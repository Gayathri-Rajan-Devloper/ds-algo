    /**
 * Time complexity of Binary search are :
 * Best Case:O(1),
 * Average Case:O(log n),
 * Worst Case:O(log n)
 **/

package search;

public class BinarySearch {

    int binarySearch(int[] arr, int l, int r, int key) {
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (key < arr[mid]) {
                r = mid - 1;
                binarySearch(arr, l, r, key);
            } else {
                l = mid + 1;
                binarySearch(arr, l, r, key);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 10, 40};
        int len = arr.length;
        BinarySearch bs = new BinarySearch();
        int index = bs.binarySearch(arr, 0, len - 1, 10);
        System.out.println("Element present at index " + index);
    }

}
