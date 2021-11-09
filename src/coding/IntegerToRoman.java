package coding;

public class IntegerToRoman {

    public static String intToRoman(int num) {
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        //Dividing by 1000 and in hundred getting reminder of dividing by 1000 and then dividing by 100
        return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + units[num % 10];
    }

    public static void main(String[] args) {
        int num = 2345;
        String roman = intToRoman(num);
        System.out.println(roman);

    }

}
























































