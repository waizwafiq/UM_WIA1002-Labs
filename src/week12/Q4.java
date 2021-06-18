package week12;

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] t = new int[]{3, 2, 5, 1, 6};
        insertionSort(t);
        System.out.println(Arrays.toString(t));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i], j = i - 1;

            while ((j >= 0) && (arr[j] > key)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
