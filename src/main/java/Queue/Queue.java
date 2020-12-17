package Queue;

public class Queue<T> {

    private T arr[];          // array to store queue elements
    private int front;          // front points to front element in the queue
    private int rear;           // rear points to last element in the queue
    private int capacity;       // maximum capacity of the queue
    private int count;

    public Queue(int size)
    {
        arr = (T[])new Object[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    // Utility function to add an item to the queue
    public void enqueue(T item)
    {
        // check for queue overflow
        if (isFull())
        {
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Inserting " + item);

        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }

    // Utility function to remove front element from the queue
    public T dequeue() {
        T deQueuedElement = null;
        // check for queue underflow
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }

        deQueuedElement = arr[front];

        front = (front + 1) % capacity;
        count--;
        return deQueuedElement;
    }


    // Utility function to return front element in the queue
    public T peek()
    {
        if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
    }


    // Utility function to return the size of the queue
    public int size()
    {
        return count;
    }

    // Utility function to check if the queue is empty or not
    public Boolean isEmpty()
    {
        return (size() == 0);
    }

    // Utility function to check if the queue is full or not
    public Boolean isFull()
    {
        return (size() == capacity);
    }
}
