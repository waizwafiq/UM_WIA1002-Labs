package week13;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(15);
        bst.insert(6);
        bst.insert(4);
        bst.insert(20);
        bst.insert(14);
        bst.insert(4);
        bst.insert(5);
        bst.insert(8);
        bst.insert(11);
        bst.insert(9);
        bst.inOrder();
        bst.preOrder();
        bst.postOrder();
    }
}
