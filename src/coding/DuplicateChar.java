/*
Get the String passed as a argument
Create array using that string
Create a map with <Character,Integer>
Iterate the array and add the values in map
check if the key is already present if present then update the value by incrementing to 1
If not then add it to map with value 1
Iterate map and print the duplicate values
 */

package coding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateChar {

    public static void printDuplicate(String str) {
        Map<Character, Integer> map = new HashMap<>();

        char[] arr = str.toCharArray();
        for (Character ch : arr) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entrySet : set) {
            if (entrySet.getValue() > 1) {
                System.out.println("Duplicate values are " + entrySet.getKey() + " " + entrySet.getValue());
            }
        }

    }

    public static void main(String[] args) {
        String str = "Programming";
        printDuplicate(str);
    }
}
