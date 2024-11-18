package com.collection_api.quaue.concurrent_linked_queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class SizeTracking {

    public static void main(String[] args) throws InterruptedException {
        // Initialize the queue and add initial elements
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        System.out.println("Initial Queue: " + queue);

        // Producer thread to add elements to the queue
        Thread producerThread = new Thread(() -> {
            for (int i = 7; i > 3; i--) {
                queue.offer(i);
                System.out.println("Produced element: " + i + " | Queue size: " + queue.size());
                try {
                    // Simulate production delay
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Consumer thread to remove elements from the queue
        Thread consumerThread = new Thread(() -> {
            while (!queue.isEmpty() || Thread.currentThread().isAlive()) {  // Modified condition
                Integer removed = queue.poll();
                if (removed != null) {
                    System.out.println("Consumed element: " + removed + " | Queue size: " + queue.size());
                }
                try {
                    // Simulate consumption delay
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Start both threads
        producerThread.start();
        consumerThread.start();

        // Wait for both threads to complete
        producerThread.join();
        consumerThread.join();

        // Print final state of the queue
        System.out.println("Final Queue (should be empty): " + queue);
    }
}

