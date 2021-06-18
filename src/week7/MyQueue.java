package week7;

public class MyQueue<E> {

    private LL<E> list;

    public MyQueue() {
        list = new LL<>();
    }

    public MyQueue(E[] e) {
        list = new LL<>();

        for (E elem : e)
            enqueue(elem);
    }

    public void enqueue(E e) {
        list.add(e);
    }

    public E dequeue() {
        E dequeued = list.getFirst();
        list.removeFirst();
        return dequeued;
    }

    public E getElement(int index) {
        return list.get(index);
    }

    public E peek() {
        return list.getFirst();
    }

    public int getSize() {
        return list.getSize();
    }

    public boolean contains(E e) {
        return list.contains(e);
    }

    public boolean isEmpty() {
        return list.getSize() == 0;
    }

    public String toString() {
        StringBuilder out = new StringBuilder("| ");
        for (int i = getSize() - 1; i >= 0; i--)
            out.append(list.get(i)).append(" | ");
        return out.toString();
    }

    public void display() {
        System.out.println(this);
    }

    public void set(int index, E e){
        list.set(index, e);
    }

    public void reverse() {
        list.reverse();
    }
}

class Q1 {
    public static void main(String[] args) {
        MyQueue<String> fruitQ = new MyQueue<>(new String[] {"Durian", "Blueberry"});
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");

        fruitQ.display();

        System.out.println("Top item: " + fruitQ.peek());
        System.out.println("Size: " + fruitQ.getSize());

        fruitQ.dequeue();

        System.out.println("Item at index position 2: " + fruitQ.getElement(2));

        System.out.println("Is Cherry in the queue?: " + fruitQ.contains("Cherry"));
        System.out.println("Is Durian in the queue?: " + fruitQ.contains("Durian"));

        if(!fruitQ.isEmpty())
            fruitQ.display();
        else
            System.out.println("Queue is empty!");

    }
}