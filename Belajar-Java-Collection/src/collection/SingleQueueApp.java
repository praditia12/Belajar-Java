package collection;

import collection.collections.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {

        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());

        System.out.println(queue.offer("Adit"));
        System.out.println(queue.offer("Praditia"));
        System.out.println(queue.offer("Rahayu"));

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());

    }
}
