package com.collection_api.quaue.arrayqueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayQueueExample {
    public static void main(String[] args) {
        // Create a Queue using ArrayDeque
        Queue<String> queue = new ArrayDeque<>();

        // Adding elements to the Queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Display the Queue
        System.out.println("Queue: " + queue);

        // Peek at the front of the Queue
        System.out.println("Front element: " + queue.peek());

        // Removing elements from the Queue
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue after removal: " + queue);

        // Check if the Queue is empty
        System.out.println("Is the Queue empty? " + queue.isEmpty());
    }
}

