package past_2019;

public class MyLinkedList<T> {
    private Node<T> head, tail;
    private int size;

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public void addFirst(T e) {
        if (head == null) {
            head = tail = new Node<>(e);
            return;
        }

        Node<T> newNode = new Node<>(e);
        newNode.setNext(head);
        head = newNode;
    }

    public void addLast(T e) {
        if (tail == null) {
            head = tail = new Node<>(e);
            return;
        }

        Node<T> newNode = new Node<>(e);
        tail.setNext(newNode);
        tail = newNode;
    }

    public T removeFirst() {
        if (head == null)
            return null;

        Node<T> removed = head;
        head = head.getNext();

        return removed.getElement();
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