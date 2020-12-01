package Heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Heap {

    public  static List<Integer> minHeap(List<Integer> input){
        List<Integer> output = new ArrayList<>();
         //By default, Java has minHeap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        input.stream().forEach(priorityQueue::offer);
        while (priorityQueue.size()!=0){
            output.add(priorityQueue.poll());
        }
        return output;
    }

    public  static List<Integer> maxHeap(List<Integer> input){
        List<Integer> output = new ArrayList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        input.stream().forEach(priorityQueue::offer);
        while (priorityQueue.size()!=0){
            output.add(priorityQueue.poll());
        }
        return output;
    }
}
