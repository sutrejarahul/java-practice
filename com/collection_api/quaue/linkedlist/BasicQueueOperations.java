package com.collection_api.quaue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class BasicQueueOperations {
    public static void main(String[] args) {

        // 1. Initialize the queue
        Queue<Integer> queue = new LinkedList<>();

        // 2. Enqueue elements
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        // 3.1 Peek at the front of the queue
        System.out.println("Front of Queue using peek(): " + queue.peek());

        // Check if the queue is non-empty before using element()
        if (!queue.isEmpty()) {
            System.out.println("Front of Queue using element(): " + queue.element());
        }

        // 3.2 Dequeue elements
        System.out.println("Dequeuing Queue using poll(): " + queue.poll());

        // Check if the queue is non-empty before using remove()
        if (!queue.isEmpty()) {
            System.out.println("Dequeuing Queue using remove(): " + queue.remove());
        }

        // 3.3 Print the final queue state
        System.out.println("After operation, Final Queue: " + queue);
    }
}

