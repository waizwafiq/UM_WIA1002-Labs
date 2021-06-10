package week6;

import java.util.ArrayList;
import java.util.EmptyStackException;

class MyStack<T> {

    private ArrayList<T> list;

    public MyStack() {
        list = new ArrayList<>();
    }

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();

        T popped = list.get(getSize() - 1);
        list.remove(getSize() - 1);

        return popped;
    }

    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();

        return list.get(getSize() - 1);
    }

    public T get(int index) {
        return list.get(index);
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    @Override
    public String toString() {
        String out = "The Stack:\n";
        for (Object elems : list.toArray())
            out += elems + "\n";

        return out;
    }

    public boolean search(T o) {
        return list.contains(o);
    }


    public static void main(String[] args) {
        MyStack<Character> stack = new MyStack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        System.out.println(stack.toString());
        System.out.println("Is 'b' in the stack?: " + stack.search('b'));
        System.out.println("Is 'k' in the stack?: " + stack.search('k'));

        MyStack<Integer> stack2 = new MyStack<>();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println("\n" + stack2.toString());
        System.out.println("Is 6 in the stack?: " + stack2.search(6));

    }
}