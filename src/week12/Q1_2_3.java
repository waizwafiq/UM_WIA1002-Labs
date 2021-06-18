package week12;

import java.util.Arrays;

public class Q1_2_3 {
    public static void main(String[] args) {
        int[] t = new int[]{3, 2, 5, 1, 6};
        selectionSortSmallest(t);
        System.out.println(Arrays.toString(t));
        selectionSortLargest(t);
        System.out.println(Arrays.toString(t));
    }

    public static void selectionSortSmallest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[idx])
                    idx = j;    //searching for lowest index

            int smallerNumber = arr[idx];
            arr[idx] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void selectionSortLargest(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] > arr[idx])
                    idx = j;    //searching for lowest index

            int smallerNumber = arr[idx];
            arr[idx] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}
