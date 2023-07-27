package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>(10);

        queue.add("A");
        queue.add("R");
        queue.add("F");
        queue.add("D");
        queue.add("C");
        queue.add("B");
        queue.add("U");
        queue.add("S");
        queue.add("L");
        queue.add("O");
        queue.add("Z");

        for (String next = queue.poll(); next!=null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size());

    }
}
