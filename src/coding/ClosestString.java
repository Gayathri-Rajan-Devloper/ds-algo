package coding;

public class ClosestString {

    public static int distance(String[] arr, String word, String word2) {
        int index = -1, index1 = -1, min = Integer.MAX_VALUE;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                index = i;
            }
            if (arr[i].equals(word2)) {
                index1 = i;
            }

            if (index != -1 && index1 != -1) {
                min = Math.abs(index - index1);
            }
        }
        return min;
    }

    public static void main(String[] args) {
        String[] arr = {"geeks", "for", "geeks", "contribute",
                "practice"};

        String word = "geeks";
        String word1 = "practice";

        int dis = distance(arr, word, word1);
        System.out.println(dis);
    }
}
