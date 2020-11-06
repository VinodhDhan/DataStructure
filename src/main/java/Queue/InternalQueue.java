package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class InternalQueue {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<Integer>();
        IntStream.rangeClosed(0,10).forEach(que::offer);
        while (que.size()>0){
            System.out.println(que.poll());
        }
        System.out.println(que.size());
    }
}
