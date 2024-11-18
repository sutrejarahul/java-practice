package com.collection_api.quaue.concurrent_linked_queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrencyWithMultipleThreads {

    public static void main(String[] args) throws InterruptedException {
        // Create a ConcurrentLinkedQueue and initialize with elements
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        queue.offer(1);
        queue.offer(3);
        queue.offer(5);
        queue.offer(7);
        queue.offer(9);

        System.out.println("Initial Queue: " + queue);

        // Thread to add elements to the queue
        Thread threadOne = new Thread(() -> {
            queue.add(2);
            queue.add(4);
            queue.add(6);
            queue.add(8);
            queue.add(10);

            System.out.println("Queue after adding elements: " + queue);
        });

        // Thread to remove elements from the queue
        Thread threadTwo = new Thread(() -> {
            while (!queue.isEmpty()) {
                Integer removed = queue.poll();
                System.out.println("Polled: " + removed + ", Current Queue: " + queue);
            }
        });

        // Start both threads to run concurrently
        threadOne.start();
        threadTwo.start();

        // Wait for both threads to complete
        threadOne.join();
        threadTwo.join();

        // Print final state of the queue
        System.out.println("Final Queue (should be empty): " + queue);
    }
}

