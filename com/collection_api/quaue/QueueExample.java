package com.collection_api.quaue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // add(E e) - Adds an element to the queue (throws exception if capacity is full)
        queue.add("First");
        queue.add("Second");
        System.out.println("Queue after add: " + queue);

        // offer(E e) - Adds an element to the queue (returns false if capacity is full)
        queue.offer("Third");
        System.out.println("Queue after offer: " + queue);

        // element() - Retrieves, but does not remove, the head of the queue
        // Throws NoSuchElementException if the queue is empty
        System.out.println("Head of queue using element(): " + queue.element());

        // peek() - Retrieves, but does not remove, the head of the queue (returns null if empty)
        System.out.println("Head of queue using peek(): " + queue.peek());

        // remove() - Retrieves and removes the head of the queue
        // Throws NoSuchElementException if the queue is empty
        System.out.println("Removed element using remove(): " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        // poll() - Retrieves and removes the head of the queue (returns null if empty)
        System.out.println("Removed element using poll(): " + queue.poll());
        System.out.println("Queue after poll: " + queue);

        // Checking the final state of the queue
        System.out.println("Final state of queue: " + queue);

        // Handling methods on an empty queue
        queue.poll(); // Empty the queue completely
        System.out.println("Queue is now empty: " + queue);

        // Calling peek() on an empty queue (safe)
        System.out.println("Peek on empty queue: " + queue.peek()); // returns null

        // Calling element() on an empty queue (throws exception)
        try {
            System.out.println("Element on empty queue: " + queue.element());
        } catch (Exception e) {
            System.out.println("Exception using element() on empty queue: " + e);
        }

        // Calling poll() on an empty queue (returns null)
        System.out.println("Poll on empty queue: " + queue.poll()); // returns null
    }
}
