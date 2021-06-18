package week7;

public class Q2 {

    public static boolean isPalindrome(String str) {
        StringBuilder reversed = new StringBuilder();

        MyQueue<String> letters = new MyQueue<>();
        for (int i = 0; i < str.length(); i++) {
            letters.enqueue(str.charAt(i) + ""); //+ "" to transform char -> String
        }
        letters.reverse();

        for (int i = 0; i < str.length(); i++) {
            reversed.append(letters.getElement(i));
        }

        return str.equals(reversed.toString());
    }

    public static void main(String[] args) {
        String str = "uwu";

        if (isPalindrome(str))
            System.out.println(str + " is a palindrome!");
        else
            System.out.println(str + " is not a palindrome!");
    }
}