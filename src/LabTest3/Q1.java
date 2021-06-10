/*
package LabTest3;
*/

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your code below: ");
        String line = in.nextLine();
        System.out.println(topUp(line));
    }

    public static String topUp(String line) {
        String[] codes = line.split("");
        int count = 0;
        for (String code : codes)
            if (code.equals("*")) count++;


        //This is the base case of the recursive function (the number of asterisks must be EVEN)
        if (count % 2 != 0 || !codes[codes.length - 1].equals("*") || !codes[0].equals("*")) {
            System.out.println("Please put the digits between two asterisks:");
            Scanner in = new Scanner(System.in);
            String newline = in.nextLine();
            return topUp(newline);
        }
        return "|-----> correct";
    }
}