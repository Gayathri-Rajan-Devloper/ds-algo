package search;

public class JumpSearch {

    public int search(int[] a, int target) {
        int len = a.length;
        //Find the jump by taking sqrt of len of array
        int m = (int) Math.floor(Math.sqrt(len));
        int currentLastIndex = m - 1;
        //check if currntlastIndex is less then length and target element is greater then currentLastIndex
        while (currentLastIndex < len && target > a[currentLastIndex]) {
            currentLastIndex += m;
        }
       // If target element is less than element at currentLastIndex then go back to previous index and perform a linear search
       //   in previous index
        for (int i = currentLastIndex - m + 1; i <= currentLastIndex && i < a.length; i++) {
            if (target == a[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 4, 10, 40 };
        int len = arr.length;
        JumpSearch js = new JumpSearch();
        int index = js.search(arr,40);
        System.out.println("Element present at index " +index);
    }
}
