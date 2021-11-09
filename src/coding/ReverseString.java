package coding;

public class ReverseString {


    public String reverseString(String in) {

        String[] arr = in.split("\\.");
        String rev = "";
        for (int i = arr.length - 1; i >= 1; i--) {
            rev = rev + arr[i] + ".";
        }
        rev = rev + arr[0];
        return rev;
    }

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String in = "i.like.this.program.very.much";
        String reversed = rs.reverseString(in);
        System.out.println(reversed);

    }
}
