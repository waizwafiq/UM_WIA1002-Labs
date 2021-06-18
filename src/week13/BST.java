package week13;

public class BST<E extends Comparable<E>> {
    private static class TreeNode<T> {
        private TreeNode<T> left, right;
        private T element;

        public TreeNode(T element) {
            this.element = element;
            left = right = null;
        }

        public T getElement() {
            return element;
        }
    }

    private TreeNode<E> root;

    public BST() {
        root = null;
    }

    public BST(E e) {
        assert false;
        root.element = e;
    }

    public boolean search(E e) {
        return search(root, e);
    }

    public boolean search(TreeNode<E> current, E e) {
        if (current == null)
            return false;
        else if (e.compareTo(current.element) < 0)
            return search(current.left, e); // go to the left child
        else if (e.compareTo(current.element) > 0)
            return search(current.right, e); // go to the right child
        else
            return true;
    }

    public void insert(E e) {
        root = insert(root, e);
    }

    public TreeNode<E> insert(TreeNode<E> current, E e) {
        if (current == null)
            current = new TreeNode<>(e);
        else if (e.compareTo(current.element) <= 0)
            current.left = insert(current.left, e);
        else
            current.right = insert(current.right, e);

        return current;
    }

    private boolean found;

    public boolean delete(E e) {
        root = delete(root, e);
        return found;
    }

    public TreeNode<E> delete(TreeNode<E> current, E e) {
        if (current == null)
            found = false;
        else if (e.compareTo(current.element) < 0)
            current.left = delete(current.left, e);
        else if (e.compareTo(current.element) > 0)
            current.right = delete(current.right, e);
        else {
            current = delete(current);
            found = true;
        }
        return current;
    }

    private TreeNode<E> delete(TreeNode<E> node) {
        if (node.left == null)
            return node.right;
        else if (node.right == null)
            return node.left;
        else {
            E e = getPredecessor(node.left);
            node.element = e;
            node.left = delete(node.left, e);
            return node;
        }
    }

    public E getPredecessor(TreeNode<E> current) {
        while (current.right != null)
            current = current.right;

        return current.element;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public int getSize() {
        return getSize(root);
    }

    public int getSize(TreeNode<E> current) {
        if (current == null)
            return 0;
        else
            return getSize(current.left) + getSize(current.right) + 1;
    }

    public TreeNode<E> getRoot() {
        return root;
    }

    public E getElement(E e) {
        return getElement(root, e);
    }

    public E getElement(TreeNode<E> current, E e) {
        if (current == null)
            return null;
        else if (e.compareTo(current.element) < 0)
            return getElement(current.left, e); // go to the left child
        else if (e.compareTo(current.element) > 0)
            return getElement(current.right, e); // go to the right child
        else
            return current.element;
    }
}