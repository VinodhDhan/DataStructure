package test;

import BinarySearchTree.BinarySearchTree;

public class BinaryTreeTester {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        binarySearchTree.insert(2);
        binarySearchTree.insert(20);
        binarySearchTree.insert(3);
        binarySearchTree.printTree(binarySearchTree.root);
        System.out.println(binarySearchTree.contains(3));

    }
}
