package week13;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Tester {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        BST<Integer> bst = new BST<>(inputInt());
        System.out.print("INORDER: ");
        bst.inOrder();
        System.out.print("POSTORDER: ");
        bst.postOrder();
        System.out.print("PREORDER: ");
        bst.preOrder();

        System.out.println("Height of BST: " + bst.height());
        System.out.println("Root: " + bst.getRoot().getElement());
        System.out.println("Check whether 10 is in the tree? " + bst.search(10));
        System.out.println("Delete 53? " + bst.delete(53));
        System.out.println("Updated inorder data: ");
        bst.inOrder();
        System.out.println("Min value: " + bst.minValue());
        System.out.println("Max value: " + bst.maxValue());
    }

    public static String[] inputStr() {
        System.out.print("Insert elements here: ");
        return sc.nextLine().replace(" ", "").split(",");
    }

    public static ArrayList<Integer> inputInt() {
        ArrayList<Integer> out = new ArrayList<>();
        for (String e : inputStr())
            out.add(Integer.valueOf(e));

        return out;
    }
}
