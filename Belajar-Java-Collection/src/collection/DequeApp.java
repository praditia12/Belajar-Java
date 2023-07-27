package collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        // Stack / tumpukan
        Deque<String> deque = new LinkedList<>();

        deque.offerLast("WKKF");
        deque.offerLast("7777");
        deque.offerLast("YRNRJ");
        deque.offerLast("ENBKG");

        System.out.println(deque.pollLast());
        System.out.println(deque.pollLast());

        System.out.println("=============");

        // Antrian
        Deque<String> queue = new LinkedList<>();

        queue.offerLast("TKHGJGJ");
        queue.offerLast("jjfjfjfm");
        queue.offerLast("HGmKKFG");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());




    }
}
