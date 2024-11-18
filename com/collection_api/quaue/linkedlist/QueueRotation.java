package com.collection_api.quaue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueRotation {

    public static void main(String[] args) {
        // Initialize the queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int rotationCount = 2; // Number of times to rotate the queue

        System.out.println("Original Queue: " + queue);

        rotateQueue(queue, rotationCount);

        System.out.println("Rotated Queue: " + queue);
    }

    public static void rotateQueue(Queue<Integer> queue, int rotationCount) {
        int size = queue.size();

        // Normalize rotation count if it's greater than queue size
        rotationCount = rotationCount % size;

        for (int i = 0; i < rotationCount; i++) {
            // Move the front element to the back
            int front = queue.poll();  // Dequeue front element
            queue.add(front);          // Enqueue it to the back
        }
    }
}

