package week7.L;

public class Q2 {

    public static boolean isPalindrome(String str) {
        String reversed = "";

        MyQueue<String> letters = new MyQueue<>();
        for (int i = 0; i < str.length(); i++) {
            letters.enqueue(str.charAt(i) + ""); //+ "" to transform char -> String
        }
        letters.reverse();

        for (int i = 0; i < str.length(); i++) {
            reversed += letters.getElement(i);
        }

        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String str = "uwu";

        if (isPalindrome(str))
            System.out.println(str + " is a palindrome!");
        else
            System.out.println(str + " is not a palindrome!");
    }
}