package LinkedList;

public class CustomLinkedList<T>{

  Node<T> head;

  public Node<T> insert(T value){
    Node new_node = new Node(value);
    if(head == null){
      head = new_node;
    }else{
      Node temp_Node = head;
      while(temp_Node.next!=null){
        temp_Node = temp_Node.next;
      }
      temp_Node.next = new_node;
    }
    return new_node;
  }

// Position will be starting from 1
  public Node<T> insertAt(T value, int pos){
    Node new_node = new Node(value);
    if(head == null){
      head = new_node;
    }else{
      Node temp_Node = head;
      int counter = 1;
      if(pos == 1){
        new_node.next = temp_Node;
        head = new_node;
      } else{
        while(counter < pos-1 && temp_Node!=null){
          temp_Node = temp_Node.next;
          counter++;
        }
        Node temp = temp_Node.next;
        temp_Node.next = new_node;
        new_node.next = temp;
      }
    }
    return new_node;
  }

  public void removeNode(T value){
    Node temp_Node = head;
    if(temp_Node.value == value){
      head = temp_Node.next;
      System.out.println("Head Node has been removed");
    }else{
      while(temp_Node.next!=null){
        if(temp_Node.next.value == value){
          temp_Node.next = temp_Node.next.next;
          System.out.println("Node has been removed");
          break;
          }
          temp_Node = temp_Node.next;
      }
    }
  }

  public void removeNodeAt(int pos){
    Node temp_Node = head;
    if(pos == 1){
      head = head.next;
      System.out.println("Head Node has been removed");
    }else{
      int counter = 1;
      while(counter< pos-1 && temp_Node.next!=null){
        counter++;
        temp_Node = temp_Node.next;
      }
        temp_Node.next = temp_Node.next.next;
        System.out.println("Node has been removed");
    }
  }

  public Node<T> insertFirst(T value){
    return insertAt(value,1);
  }

  public Node<T> insertLast(T value){
    return insert(value);
  }

  public void printLinkedList(){
    Node temp_Node = head;
    if(head == null){
      System.out.println("No items to print");
      System.exit(1);
    }else{
      while(temp_Node!=null){
        System.out.println(temp_Node.value);
        temp_Node = temp_Node.next;
      }
    }
  }

}
