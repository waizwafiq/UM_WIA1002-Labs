package past_2019.Q1;

public class Node<T> {
    private T element;
    private Node<T> next;

    public Node(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}
