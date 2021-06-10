package week2;

public class StorePairGeneric<T> implements Comparable<T> {
    private T first, second;

    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setPair(T first, T second){
        this.first = first;
        this.second = second;
    }

    public String toString() {
        return "first = "+first+" second = "+second;
    }

    @Override
    public boolean equals(Object obj){
/*        if (obj == null) return false;
        if (obj == this) return true;*/
        return this.getFirst() == ((StorePairGeneric) obj).getFirst();
    }

    @Override
    public int compareTo(T obj) {
        return this.compareTo(obj);
    }
}

class tester1{
    public static void main(String[] args) {
        StorePairGeneric<Integer> a = new StorePairGeneric<>(6,4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6,3);

        System.out.println(a.getFirst().compareTo(b.getFirst()));
        //what it does is: Integer(6).compareTo(Integer(2));
    }
}
