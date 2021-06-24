package past_2019.Q1;

public class MyLinkedList<T extends Comparable<T>> {
    private Node<T> head, tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    public MyLinkedList(MyLinkedList<T> list) {
        Node<T> currentNode = list.getHead();
        while (currentNode.getNext() != null) {
            addLast(currentNode.getElement());
            currentNode = currentNode.getNext();
        }
        this.size = list.getSize();
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void addFirst(T e) {
        if (head == null) {
            head = tail = new Node<>(e);
            size++;
            return;
        }

        Node<T> newNode = new Node<>(e);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void addLast(T e) {
        if (tail == null) {
            head = tail = new Node<>(e);
            size++;
            return;
        }

        Node<T> newNode = new Node<>(e);
        tail.setNext(newNode);
        tail = newNode;
        size++;
    }

    public T removeFirst() {
        if (head == null)
            return null;

        Node<T> removed = head;
        head = head.getNext();
        size--;

        return removed.getElement();
    }

    public void sort() {
        Node<T> currentNode = head, idx;
        T temp;

        if (head != null) {
            while (currentNode != null) {
                idx = currentNode.getNext();

                while (idx != null) {
                    if (currentNode.getElement().compareTo(idx.getElement()) > 0) {

                        temp = currentNode.getElement();
                        currentNode.setElement(idx.getElement());
                        idx.setElement(temp);

                    }

                    idx = idx.getNext();
                }
                currentNode = currentNode.getNext();
            }
        }
    }

    public String toString() {
        StringBuilder out = new StringBuilder("[size=" + size + "]");
        Node<T> currentNode = head;

        while (currentNode != null) {
            out.append(" >> ");
            out.append(currentNode.getElement());
            currentNode = currentNode.getNext();
        }

        return out.toString();
    }
}