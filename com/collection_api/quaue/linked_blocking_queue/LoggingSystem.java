package com.collection_api.quaue.linked_blocking_queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class ProducerLogger implements Runnable {
    private final BlockingQueue<String> queue;
    private final int producerId;

    public ProducerLogger(BlockingQueue<String> queue, int producerId) {
        this.queue = queue;
        this.producerId = producerId;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {  // Each producer creates 10 log entries
                String log = "Log from Producer " + producerId + ": Entry " + i;
                System.out.println("Producing: " + log);
                queue.put(log);  // Blocks if queue is full
                Thread.sleep(100);  // Simulate logging delay
            }
            queue.put("STOP");  // Signal end of this producer's logging
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class ConsumerLogger implements Runnable {
    private final BlockingQueue<String> queue;
    private final int consumerId;

    public ConsumerLogger(BlockingQueue<String> queue, int consumerId) {
        this.queue = queue;
        this.consumerId = consumerId;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String log = queue.take();  // Blocks if queue is empty
                if ("STOP".equals(log)) {  // Stop condition
                    queue.put("STOP");  // Reinsert to signal other consumers
                    break;
                }
                System.out.println("Consumer " + consumerId + " consuming: " + log);
                Thread.sleep(150);  // Simulate processing delay
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class LoggingSystem {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(10);

        // Create multiple producer threads
        Thread producer1 = new Thread(new ProducerLogger(queue, 1));
        Thread producer2 = new Thread(new ProducerLogger(queue, 2));
        Thread producer3 = new Thread(new ProducerLogger(queue, 3));

        // Create multiple consumer threads
        Thread consumer1 = new Thread(new ConsumerLogger(queue, 1));
        Thread consumer2 = new Thread(new ConsumerLogger(queue, 2));

        // Start all producer and consumer threads
        producer1.start();
        producer2.start();
        producer3.start();
        consumer1.start();
        consumer2.start();

        // Wait for all producers to finish
        producer1.join();
        producer2.join();
        producer3.join();

        // Wait for all consumers to finish
        consumer1.join();
        consumer2.join();
    }
}

