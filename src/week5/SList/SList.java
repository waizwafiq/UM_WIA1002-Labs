package week5.SList;

public class SList<E> {
    private SNode<E> head, tail;
    private int size;

    public void appendEnd(E e) {
        SNode<E> newNode = new SNode<>(e);

        if (tail == null) { // if the tail is empty (list is empty)
            head = tail = newNode; // the tail is the head and is the new node.
        } else {
            tail.setNext(newNode); // the node after the initial tail is the new node
            tail = newNode; // now the new node is the tail.
        }
        size++;
    }

    public E removeInitial() {
        if (size == 0)
            return null;
        else {
            SNode<E> temp = head;

            head = head.getNext();
            size--;

            return temp.getElement();
        }
    }

    public boolean contains(E e) {
        if (size != 0) {
            SNode<E> current = head;
            while (current != null) {
                if (current.getElement().equals(e))
                    return true;

                current = current.getNext();
            }
        }
        return false;
    }

    public void clear() {
        head = tail = null;
        size = 0;
        System.out.println("List cleared!");
    }

    public void display() {
        SNode<E> current = head;
        while (current.getNext() != null) {
            System.out.print(current.getElement() + " -> ");
            current = current.getNext();
        }
        System.out.println(tail.getElement());
    }
}
