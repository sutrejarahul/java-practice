package com.collection_api.quaue.linked_blocking_queue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducersAndConsumers {

    public static void main(String[] args) throws InterruptedException {
        // Shared queue with capacity of 10
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);

        // Create and start producer threads
        Thread producerThread1 = new Thread(new Producer1(queue));
        Thread producerThread2 = new Thread(new Producer1(queue));
        Thread producerThread3 = new Thread(new Producer1(queue));

        producerThread1.start();
        producerThread2.start();
        producerThread3.start();

        // Create and start consumer threads
        Thread consumerThread1 = new Thread(new Consumer1(queue));
        Thread consumerThread2 = new Thread(new Consumer1(queue));

        consumerThread1.start();
        consumerThread2.start();

        // Wait for all producers to finish
        producerThread1.join();
        producerThread2.join();
        producerThread3.join();

        // Signal consumers to stop by adding -1 twice (one for each consumer)
        queue.put(-1);
        queue.put(-1);

        // Wait for all consumers to finish
        consumerThread1.join();
        consumerThread2.join();
    }
}

class Producer1 implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Producer1(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        Random random = new Random();
        try {
            for (int i = 0; i < 5; i++) {  // Each producer adds 5 elements
                int number = random.nextInt(100);  // Random number between 0 and 99
                System.out.println("Producing: " + number);
                queue.put(number);  // Blocks if queue is full
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer1 implements Runnable {
    private final BlockingQueue<Integer> queue;

    public Consumer1(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                int number = queue.take();  // Blocks if queue is empty
                if (number == -1) { // Sentinel value to stop consumption
                    queue.put(-1);  // Pass on the stop signal for the other consumer
                    break;
                }
                System.out.println("Consuming: " + number);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

