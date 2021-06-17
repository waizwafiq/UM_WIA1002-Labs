package week10;

public class Q1 {
    public static void main(String[] args) {
        String str = "Astronaut";
        System.out.println(substituteAI(str, str.length()));
    }

    public static String substituteAI(String str, int i) {
        if (i == 0)
            return str;

        if (str.charAt(i - 1) == 'a') {
            char[] chars = str.toCharArray();
            chars[i - 1] = 'i';
            str = String.valueOf(chars);
        }

        return substituteAI(str, i - 1);
    }
}
