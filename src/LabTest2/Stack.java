package LabTest2;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * USING ARRAYLIST TO IMPLEMENT STACK DATA STRUCTURE
 */

public class Stack {

    private String stack_name;
    private ArrayList<Person> list;

    public Stack(String stack_name) {
        list = new ArrayList<>();
        this.stack_name = stack_name;
    }

    public void push(Person p) {
        list.add(p);
    }

    public void push(String name, int age) {
        Person temp = new Person(name, age);
        list.add(new Person(name, age));
    }


    public void push(String name, int age, String gender, String occupation) {
        Person temp = new Person(name, age, gender, occupation);
        list.add(new Person(name, age, gender, occupation));
    }

    public Person pop() {
        if (isEmpty())
            throw new EmptyStackException();

        Person popped = list.get(getSize() - 1);
        list.remove(popped);

        return popped;
    }

    public Person peek() {
        if (isEmpty())
            throw new EmptyStackException();

        return list.get(getSize() - 1);
    }

    public Person get(int index) {
        return list.get(index);
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public String toString() {
        String out = stack_name + ": ";
        for (Object elem : list.toArray())
            out += elem + " ";

        return out;
    }

    public void displayStack() {
        System.out.println("----" + stack_name + "----");
        if (isEmpty()) {
            System.out.println("Empty stack!");
            return;
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(i + " " + list.get(i).toString());
            System.out.println();
        }
    }

    public boolean search(Person o) {
        return list.contains(o);
    }

    public Person[] toArray() {
        int n = list.size();
        Person[] out = new Person[n];
        for (int i = 0; i < n; i++) {
            out[i] = pop();
        }
        return out;
    }

    public void reverse() {
        ArrayList<Person> temp = new ArrayList<>();

        for (int i = 0; i < getSize(); i++)
            temp.add(list.get(i));

        list = temp;
    }
}
