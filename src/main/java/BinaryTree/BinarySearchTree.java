package BinaryTree;
public class BinarySearchTree{

  public Node<Integer> root;

  public Node<Integer> insert(Integer value){
    Node<Integer> new_Node = new Node(value);
    Node<Integer> temp = root;
    if(temp == null){
      root = new_Node;
    }else{
      while(true){
        if(value<temp.value){
          if(temp.left != null){
            temp = temp.left;
          }else{
            temp.left = new_Node;
            System.out.println("Node has been inserted in left side");
            break;
          }
        }else{
          if(temp.right != null){
            temp = temp.right;
          }else {
            temp.right = new_Node;
            System.out.println("Node has been inserted in right side");
            break;
          }
        }
      }
    }
    return new_Node;
  }

  public boolean contains(Integer value){
    Node<Integer> temp = root;
    if(temp == null){
      System.out.println("Tree is empty!! Please insert the node first");
    }else if(temp.value == value){
      return true;
    }else{
      while(temp!=null){
        if(value < temp.value){
          temp = temp.left;
        }else if(value > temp.value){
          temp = temp.right;
        }else if(value.equals(temp.value)){
          return true;
        }
      }
    }
    return false;
  }

  public void printTree(Node root){
    BTreePrinter.printNode(root);
  }
}
