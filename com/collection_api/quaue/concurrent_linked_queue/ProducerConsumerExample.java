package com.collection_api.quaue.concurrent_linked_queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ProducerConsumerExample {

    public static void main(String[] args) throws InterruptedException {
        // Shared queue between producer and consumer
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        final int MAX_PRODUCED_ITEMS = 10;

        // Producer thread
        Thread producer = new Thread(() -> {
            for (int i = 1; i <= MAX_PRODUCED_ITEMS; i++) {
                queue.offer(i);
                System.out.println("Produced: " + i);
                try {
                    // Simulate production time
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        // Consumer thread
        Thread consumer = new Thread(() -> {
            int consumedCount = 0;
            while (consumedCount < MAX_PRODUCED_ITEMS) {
                Integer item = queue.poll();
                if (item != null) {
                    System.out.println("Consumed: " + item);
                    consumedCount++;
                } else {
                    try {
                        // If queue is empty, wait before retrying
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });

        // Start both threads
        producer.start();
        consumer.start();

        // Wait for both threads to complete
        producer.join();
        consumer.join();

        System.out.println("Final Queue (should be empty): " + queue);
    }
}

