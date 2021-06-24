package past_2019.Q1;

public class Q1c {
    public static void main(String[] args) {
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        MyLinkedList<Integer> newList;

        list1.addFirst(51);
        list1.addFirst(41);
        list1.addFirst(38);
        list1.addFirst(10);
        list1.addFirst(2);

        list2.addLast(5);
        list2.addLast(12);
        list2.addLast(18);
        list2.addLast(21);
        list2.addLast(35);
        list2.addLast(41);
        list2.addLast(56);

        System.out.println(list1);
        System.out.println(list2);

        newList = combine(list1, list2);

        System.out.println("The newList is:\n" + newList);
    }

    public static MyLinkedList<Integer> combine(MyLinkedList<Integer> l1, MyLinkedList<Integer> l2) {
        MyLinkedList<Integer> outList = new MyLinkedList<>(l1);
        outList.getTail().setNext(l2.getHead());
        outList.setSize(l1.getSize() + l2.getSize());
        outList.sort();

        return outList;
    }
}
