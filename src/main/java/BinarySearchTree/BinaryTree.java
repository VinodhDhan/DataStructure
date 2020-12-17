package BinarySearchTree;

public class BinaryTree<T> {

    public Node<T> insertLevelOrder(int[] arr, Node<T> root,
                                    int i)
    {
        // Base case for recursion
        if (i < arr.length) {
            Node<T> temp = new Node(arr[i]);
            root = temp;

            // insert left child
            root.left = insertLevelOrder(arr, root.left,
                    2 * i + 1);

            // insert right child
            root.right = insertLevelOrder(arr, root.right,
                    2 * i + 2);
        }
        return root;
    }
}
