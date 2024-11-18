package com.collection_api.quaue.concurrent_linked_queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class BasicOperations {
    public static void main(String[] args) {
        // Create a ConcurrentLinkedQueue instance
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Add elements to the queue
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        // Display the initial queue contents
        System.out.println("Initial Queue: " + queue);

        // Remove and print the first element using poll()
        String firstPoll = queue.poll();
        System.out.println("First Polled Element: " + firstPoll);

        // Display the queue contents after polling an element
        System.out.println("Queue after polling: " + queue);

        // Peek and print the first element without removing it
        String firstPeek = queue.peek();
        System.out.println("First Peeked Element: " + firstPeek);

        // Check if "Element 3" exists in the queue and print the result
        boolean isExist = queue.contains("Element 3");
        System.out.println("Does Element 3 exist? " + isExist);

        // Display the final queue contents
        System.out.println("Final Queue: " + queue);
    }
}

