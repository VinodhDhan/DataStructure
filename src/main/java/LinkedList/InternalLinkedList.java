package LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.stream.IntStream;

public class InternalLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        IntStream.rangeClosed(0,10).forEach(integerLinkedList::offer);

        System.out.println(integerLinkedList.peekFirst());
        System.out.println(integerLinkedList.peekLast());
        System.out.println(integerLinkedList.pollFirst());
        System.out.println(integerLinkedList.pollLast());

        //integerLinkedList.stream().forEach(System.out::println);

        ListIterator listIterator = integerLinkedList.listIterator();

        // Forward Iteration
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        // Reverse Linked list - Reverse Iteration
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }

}
