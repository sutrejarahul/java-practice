package com.collection_api.quaue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLikedListBasic {

    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Enqueue: Adding elements to the queue
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println("Queue after enqueuing: " + queue);

        // Peek: Viewing the front of the queue without removing it
        System.out.println("Front of the queue: " + queue.peek());

        // Dequeue: Removing elements from the queue
        System.out.println("DeQueueing: " + queue.poll());
        System.out.println("Queue after deQueueing: " + queue);

        // Another peek
        System.out.println("New front of the queue: " + queue.peek());
    }
}
