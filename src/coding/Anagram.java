/*
Two Strings are said to be anagram when
1. When they both have same length
2. They have same characters
3. Repition of characters are same in both the String

This is achieved by
1.Remove blank spaces in both string and convert the string into any case
2.Converting both the string into array
3.Sort both the array
4. Check if both the arrays are equal
5.If they are equal then it is anagram
 */

package coding;

import java.util.Arrays;

public class Anagram {

    static void checkAnagram(String x, String y) {
        x = x.replace(" ", "").toLowerCase();
        y = y.replace(" ", "").toLowerCase();

        char[] arr = x.toCharArray();
        char[] arr1 = y.toCharArray();

        Arrays.sort(arr);
        Arrays.sort(arr1);
        boolean result = Arrays.equals(arr, arr1);

        if (result == true) {
            System.out.println("Strings are anagram");
        } else {
            System.out.println("Strings are not anagram");
        }
    }

    public static void main(String[] args) {
        String str = "Dhya";
        String str1 = "dAya";
        checkAnagram(str, str1);
    }
}
