package week10;

public class Q2 {

    public static void main(String[] args) {
        String str = "ABC";
        permute(str, "");
    }

    public static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        recursiveLoop(str, ans, 0);
    }

    public static String recursiveLoop(String str, String ans, int i) {
        if (i == str.length())
            return str;

        String newStr = str.substring(0, i) + str.substring(i + 1); //get string without i th character
        permute(newStr, ans + str.charAt(i));

        return recursiveLoop(str, ans, i + 1);
    }

}
