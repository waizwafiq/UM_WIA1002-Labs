package week6;

public class Q4 {
    public static void main(String[] args) {
        String str1 = "uwu", str2 = "";

        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < str1.length(); i++)
            stack.push(str1.charAt(i));

        for (int i = 0; i < str1.length(); i++)
            str2 += stack.pop();

        if (str1.equals(str2))
            System.out.println("\"" + str1 + "\"" + " is a palindrome!");
        else
            System.out.println("\"" + str1 + "\"" + " is not a palindrome!");
    }
}