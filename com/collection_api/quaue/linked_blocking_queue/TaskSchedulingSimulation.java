package com.collection_api.quaue.linked_blocking_queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Producer2 implements Runnable {
    private final BlockingQueue<String> queue;

    public Producer2(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 20; i++) {  // Produce exactly 20 tasks
                String task = "Task " + i;
                System.out.println("Producing: " + task);
                queue.put(task);  // Blocks if queue is full
                Thread.sleep(100);  // Simulate production delay
            }
            queue.put("STOP"); // Add a stop signal for the consumer
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer2 implements Runnable {
    private final BlockingQueue<String> queue;

    public Consumer2(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                String task = queue.take();  // Blocks if queue is empty
                if ("STOP".equals(task)) {   // Stop condition
                    break;
                }
                System.out.println("Consuming: " + task);
                Thread.sleep(150); // Simulate consumption delay
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class TaskSchedulingSimulation {
    public static void main(String[] args) throws InterruptedException {
        // Bounded queue with capacity of 10
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(10);

        Thread producer = new Thread(new Producer2(queue));
        Thread consumer = new Thread(new Consumer2(queue));

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();
    }
}

