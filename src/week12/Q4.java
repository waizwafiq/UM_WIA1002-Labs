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
        for (int j = 1; j < n; j++) {
            int key = arr[j], i = j - 1;
            while ((i >= 0) && (arr[i] > key)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }
}
