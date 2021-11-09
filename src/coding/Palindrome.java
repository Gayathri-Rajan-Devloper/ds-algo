//It will check if the string are equal in both the direction when we readig it
/*
Approach: Our approach will be that initially, we will take two pointers i pointing to the
start of the string and j pointing to the end of the string. Keep incrementing i and
decrementing j while i < j and at every step check whether the characters at these pointers
are same or not. If not then the string is not a palindrome else it is.
 */


package coding;

public class Palindrome {

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abc";
        boolean flag = isPalindrome(str);
        System.out.println(flag);
    }

}
