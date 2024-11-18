package com.collection_api.quaue.concurrent_linked_queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class EmptyQueueHandling {

    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        // Attempt to poll from an empty queue
        Integer polledElement = queue.poll();
        if (polledElement == null) {
            System.out.println("Queue is already empty; poll operation returned nothing.");
        } else {
            System.out.println("Polled Element: " + polledElement);
        }

        // Attempt to peek from an empty queue
        Integer peekedElement = queue.peek();
        if (peekedElement == null) {
            System.out.println("Queue is empty; peek operation returned nothing.");
        } else {
            System.out.println("Peeked Element: " + peekedElement);
        }

        // Add elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println("Queue after adding elements: " + queue);

        // Empty the queue safely
        while (!queue.isEmpty()) {
            Integer removedElement = queue.poll();
            System.out.println("Removed Element: " + removedElement);
        }

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
