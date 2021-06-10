package week6;

import java.util.Scanner;
class TestIntMyStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyStack<Integer> stack = new MyStack<>();

        //prompt user to enter an integer value
        System.out.print("Enter an integer value: ");
        int value = input.nextInt();

        //push the values 1 through the user entered value onto the stack
        stack.push(value);



    }
}
