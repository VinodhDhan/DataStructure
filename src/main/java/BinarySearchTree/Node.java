package BinarySearchTree;
public class Node<T>{
   T value;
  Node<T> left;
  Node<T> right;

  public Node(){};

  public Node(T value){
    this.value = value;
    this.left = null;
    this.right = null;
  }

}
