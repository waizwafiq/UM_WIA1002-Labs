package week2;

public class FindMax {
    public static void main(String[] args) {
        Circle<Integer>[] intCircle = new Circle[] {new Circle<>(1), new Circle<>(2), new Circle<>(3)};
        Circle<String>[] strCircle = new Circle[] {new Circle<>("red"), new Circle<>("green"), new Circle<>("blue")};
        Circle<Double>[] doubleCircle = new Circle[] {new Circle<>(3.0), new Circle<>(2.9), new Circle<>(5.9)};

        System.out.println(max(intCircle));
        System.out.println(max(strCircle));
        System.out.println(max(doubleCircle));
    }

    public static <E extends Comparable<E>> E max(Circle<E>[] list){
        E max = list[0].getRadius();
        for (int i = 1; i < list.length; i++) {
            if(max.compareTo(list[i].getRadius()) < 0)
                max = list[i].getRadius();
        }
        return max;
    }
}

class Circle<T> implements Comparable<T> {
    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    public T getRadius() {
        return radius;
    }

    @Override
    public int compareTo(T o) {
        return this.compareTo(o);
    }
}
