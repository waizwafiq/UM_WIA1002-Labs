package week2;

public class MinMaxTwoDArray {

    public static <E extends Comparable<E>> E min(E[][] list){
        E min = list[0][0]; //initialize the minimum value

        for(int i=0; i < list.length; i++) { //for all rows:
            for(int j=0; j < list[i].length; j++) { //for all columns:
                if (min.compareTo(list[i][j]) > 0) //if min > list[i][j]
                    min = list[i][j];
            }
        }
        return min;
    }

    public static <E extends Comparable<E>> E max(E[][] list){
        E max = list[0][0]; //initialize the minimum value

        for(int i=0; i < list.length; i++) { //for all rows:
            for(int j=0; j < list[i].length; j++) { //for all columns:
                if (max.compareTo(list[i][j]) < 0) //if max < list[i][j]
                    max = list[i][j];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[][] numbers = {{4,5,6},{1,2,3}};
        System.out.println(max(numbers));
    }
}
