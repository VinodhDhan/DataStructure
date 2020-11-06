package Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class InternalDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(1);
        deque.offer(2);
        deque.offerFirst(3);
        deque.offerLast(6);
        //System.out.println(deque.size());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        IntStream.rangeClosed(11,20).forEach(deque::offer);
        while(deque.size()>0){
            System.out.println(deque.poll());
        }
        System.out.println(deque.size());
    }
}
