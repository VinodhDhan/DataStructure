package Queue;

import java.util.Arrays;

public class CircularQueue<T> {

    //Current Circular Queue Size
    private int currentSize;
    //Circular Queue maximum size
    private int maxSize;
    //rear position of Circular queue(new element enqueued at rear).
    private int rear;
    //front position of Circular queue(element will be dequeued from front).
    private int front;

    private T[] circularQueueElements;

    public CircularQueue(int maxSize) {
        this.maxSize = maxSize;
        circularQueueElements = (T[]) new Object[this.maxSize];
        currentSize = 0;
        front = -1;
        rear = -1;
    }

    /**
     * Enqueue elements to rear.
     */
    public void enqueue(T item){
        if (isFull()) {
            System.out.println("Circular Queue is full. Element cannot be added");
            System.exit(1);
        }
        else {
            rear = (rear + 1) % circularQueueElements.length;
            circularQueueElements[rear] = item;
            currentSize++;

            if (front == -1) {
                front = rear;
            }
        }
    }


    /**
     * Dequeue element from Front.
     */
    public T dequeue()  {
        T deQueuedElement = null;
        if (isEmpty()) {
            System.out.println("Circular Queue is empty. Element cannot be retrieved");
            System.exit(1);
        }
        else {
            deQueuedElement = circularQueueElements[front];
            circularQueueElements[front] = null;
            front = (front + 1) % circularQueueElements.length;
            currentSize--;
        }
        return deQueuedElement;
    }

    /**
     * Check if queue is full.
     */
    public boolean isFull() {
        return (currentSize == circularQueueElements.length);
    }

    /**
     * Check if Queue is empty.
     */
    public boolean isEmpty() {
        return (currentSize == 0);
    }


    @Override
    public String toString() {
        return "CircularQueue [" + Arrays.toString(circularQueueElements) + "]";
    }


}
