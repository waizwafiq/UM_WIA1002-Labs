package week2;

public class CompareMax {

    public static <T extends Comparable<T>> T maximum(T p1, T p2, T p3){
        //when p1 is max:
        if(p1.compareTo(p2) > 0 && p1.compareTo(p3) > 0)
            return p1;
        //when p2 is max
        else if(p2.compareTo(p1) > 0 && p2.compareTo(p3) > 0)
            return p2;
        //when p3 is max
        else if(p3.compareTo(p1) >0 && p3.compareTo(p2) > 0)
            return p3;
        //when p1==p2==p3
        else
            return p1;
    }

    public static void main(String[] args) {
        System.out.println(maximum(5, 7, 6));
    }
}
