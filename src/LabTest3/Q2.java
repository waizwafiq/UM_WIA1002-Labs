/*package LabTest3;*/

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of switches: ");
        int switches = sc.nextInt();
        System.out.println("There are " + switches + " in the campus.");
        System.out.println("The total number of connections required is" + calc(switches));
    }

    public static int calc(int n) {
        /*
        THE FORMULA TO GET THE NUMBER OF CONNECTIONS (A COMPLETE GRAPH) IS
        1 + 2 + ..  + (n-1) = (n - 1) + calc(n - 1)
         */
        if (n == 0)
            return 0;
        else
            return (n - 1) + calc(n - 1);
    }
}
