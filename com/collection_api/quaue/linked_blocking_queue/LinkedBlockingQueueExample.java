package com.collection_api.quaue.linked_blocking_queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    private int productionLimit;

    public Producer(BlockingQueue<Integer> queue, int productionLimit) {
        this.queue = queue;
        this.productionLimit = productionLimit;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= productionLimit; i++) {
                System.out.println("Producing: " + i);
                queue.put(i);  // Add an item to the queue, blocks if queue is full
                Thread.sleep(100); // Simulate time to produce
            }
            queue.put(-1); // Add a sentinel value to indicate end of production
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Integer item = queue.take(); // Retrieve item, blocks if queue is empty
                if (item == -1) { // Sentinel value to stop consumption
                    break;
                }
                System.out.println("Consuming: " + item);
                Thread.sleep(150); // Simulate time to consume
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class LinkedBlockingQueueExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(5); // Limit the queue size
        int productionLimit = 10;

        Thread producer = new Thread(new Producer(queue, productionLimit));
        Thread consumer = new Thread(new Consumer(queue));

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

