package test;

import BinarySearchTree.*;

public class BinaryTreeTester {
    public static void main(String[] args) {

//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.insert(10);
//        binarySearchTree.insert(2);
//        binarySearchTree.insert(20);
//        binarySearchTree.insert(3);
//        binarySearchTree.printTree(binarySearchTree.root);
//        System.out.println(binarySearchTree.contains(3));

        int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        Node<Integer> root = new Node<Integer>();
        BinaryTree binaryTree = new BinaryTree();
        Node<Integer> result = binaryTree.insertLevelOrder(arr,root,0);
        BTreePrinter.printNode(result);


    }
}
