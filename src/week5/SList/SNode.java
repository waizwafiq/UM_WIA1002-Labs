package week5.SList;

public class SNode <E> {
    private SNode<E> next;
    private E element;

    public SNode() {
    }

    public SNode(E element) {
        this.element = element;
    }

    public SNode<E> getNext() {
        return next;
    }

    public void setNext(SNode<E> next) {
        this.next = next;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
