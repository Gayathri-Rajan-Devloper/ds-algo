package coding;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        //Put the roman values into map
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            //check is current character is greater than then previous character
            if (i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                //if it is true then subtract it 2 times --> 1. When it added 2. have to subtract that from current index i.e why it's *2
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            } else {
                // if not then simply add that with result
                result += map.get(s.charAt(i));
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String roman = "CCXLVIII";
        int num = romanToInt(roman);
        System.out.println(num);
    }
}

//Here in the above example as X(10) is less then L(50) so we have to subtract 10 from result
// and also with 50 2 times subtraction