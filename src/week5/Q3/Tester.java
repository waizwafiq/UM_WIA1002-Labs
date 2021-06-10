package week5.Q3;

public class Tester {
    public static void main(String[] args) {
        DLL<Integer> list = new DLL<>();

        list.add(1);
        list.add(100);
        list.add(2, 2);
        list.remove(3);
        list.traverseForward();
        list.traverseBackward();
        System.out.println("Current size of list: " + list.getSize());
        list.clear();
        System.out.println("Current size of list: " + list.getSize());
    }
}
