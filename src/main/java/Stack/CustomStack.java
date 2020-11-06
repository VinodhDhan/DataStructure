package Stack;

public class CustomStack<T>{
  private int top;
  private T[] arr;
  private int capacity;

  CustomStack(int size){
  arr = (T[])new Object[size];
  top = -1;
  capacity = 0;
  }

  public T push(T value){
    if(isFull()){
      System.out.println("Stack OverFlow Error");
      System.exit(1);
    }
    arr[++top] = value;
    capacity++;
    return value;
  }

  public T pop(){
    if(isEmpty()){
      System.out.println("No items to pop");
      System.exit(1);
    }
    capacity--;
    return arr[top--];
  }

  public T peek(){
    if(isEmpty()){
      System.out.println("No items to peek");
      System.exit(1);
    }
    return arr[top];
  }


  public boolean isFull(){
    return capacity == top-1;
  }

  public boolean isEmpty(){
    return top == -1;
  }

}
