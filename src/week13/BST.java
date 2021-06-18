package week13;

public class BST<E extends Comparable<E>> {
    private static class TreeNode<T> {
        private TreeNode<T> left, right;
        private T element;

        public TreeNode(T element) {
            this.element = element;
            left = right = null;
        }
    }
}