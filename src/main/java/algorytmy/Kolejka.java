package algorytmy;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Kolejka {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(2);
        queue.offer(5);
        queue.offer(12);
        queue.offer(5);
        System.out.println(queue.poll());
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
