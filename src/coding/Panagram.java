/*
Given a string check if it is Pangram or not. A pangram is a sentence
containing every letter in the English Alphabet.
 */

package coding;

public class Panagram {

    static boolean isPanagram(String str) {
        str = str.toUpperCase();
        for (char i = 'A'; i <= 'Z'; i++) {
            if (!str.contains(String.valueOf(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "Bawds jog, flick quartz, vex nymph";
        boolean flag = isPanagram(str);
        System.out.println(flag);
    }
}
