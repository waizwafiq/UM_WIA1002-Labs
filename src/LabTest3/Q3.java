/*
package LabTest3;
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        int[] arr = new int[5];
        //RUN THE FUNCTION RECURSIVELY
        arr = run(arr, arr.length);

        //PRINT OUT ARRAYS
        System.out.println("The array of integers is: ");
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println();
    }

    public static int[] run(int[] arr, int len) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        try {
            int in = sc.nextInt();
            arr[arr.length - len] = in;
            return run(arr, len - 1);
        } catch (InputMismatchException ex) {
            //IF THE INPUT IS NOT AN INTEGER!
            System.out.println("Invalid integer type!");
            return run(arr, len);
        } catch (ArrayIndexOutOfBoundsException ex) {
            //IF THE ARRAY IS OUT OF BOUNDS (This is the base case)
            return arr;
        }
    }
}