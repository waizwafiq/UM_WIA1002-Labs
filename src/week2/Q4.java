package week2;

import java.util.Arrays;

public class Q4 {
    public static <T extends Comparable<T>> String minmax(T[] arr){
        T min, max;
        max = min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(min.compareTo(arr[i]) > 0) min = arr[i];
            if(max.compareTo(arr[i]) < 0) max = arr[i];
        }
        return "Min: "+min+"  Max: "+max;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        System.out.println(minmax(intArray));
        System.out.println(minmax(strArray));
    }
}
