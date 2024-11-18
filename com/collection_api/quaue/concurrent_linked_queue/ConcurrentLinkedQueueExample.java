package com.collection_api.quaue.concurrent_linked_queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {

    public static void main(String[] args) {
        // Create a ConcurrentLinkedQueue instance
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<>();

        // Add elements to the queue
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        // Display the queue
        System.out.println("Queue after adding elements: " + queue);

        // Remove an element from the queue
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);

        // Peek at the front element without removing it
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);

        // Display the queue after removal
        System.out.println("Queue after removal: " + queue);

        // Check if the queue contains a specific element
        boolean containsElement = queue.contains("Element 2");
        System.out.println("Does the queue contain 'Element 2'? " + containsElement);

        // Display the size of the queue
        System.out.println("Queue size: " + queue.size());
    }
}

