package week5.Q2;

public class SLL<E> {

    private Node<E> head, tail;
    private int size;

    private class Node<T> {
        private Node<T> next;
        private T element;

        public Node(T element) {
            this.next = null;
            this.element = element;
        }
    }

    public SLL() {
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);

        if (head == null) // if the head is empty (list is empty)
            head = tail = newNode; // the head is the tail and is the new node.
        else {
            newNode.next = head; // the node after the new one is the initial head
            head = newNode; // now the head is the new node
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e);

        if (tail == null) { // if the tail is empty (list is empty)
            head = tail = newNode; // the tail is the head and is the new node.
        } else {
            tail.next = newNode; // the node after the initial tail is the new node
            tail = newNode; // now the new node is the tail.
        }
        size++;
    }

    public void add(E e) {
        if (size == 0)
            addFirst(e);
        else
            addLast(e);
    }

    public int indexOf(E e) {
        Node<E> current = head; // starting from the head

        for (int i = 0; i < size; i++) {
            if (current.element.equals(e))
                return i;
            current = current.next;
        }

        return -1;
    }

    public void removeElement(E e) {
        if (head != null && contains(e)) {
            Node<E> current = head;

            for (int i = 0; i < indexOf(e) - 1; i++) //traverse and stop before the requested node
                current = current.next;

            //The current's next node is the requested node's next node
            current.next = current.next.next;
            size--;
        }
    }

    public void printList() {
        Node<E> current = head;
        while (current.next != null) {
            System.out.print(current.element + ", ");
            current = current.next;
        }
        System.out.println(tail.element+".");
    }

    public int getSize() {
        return size;
    }

    public boolean contains(E e) {
        if (size != 0) {
            Node<E> current = head;
            while (current != null) {
                if (current.element.equals(e))
                    return true;

                current = current.next;
            }
        }
        return false;
    }

    public void replace(E e, E newE) {
        if (head != null) {
            Node<E> current = head;

            while (current != null) {
                if (current.element.equals(e))
                    break;
                current = current.next;
            }

            current.element = newE;
        }
    }
}
