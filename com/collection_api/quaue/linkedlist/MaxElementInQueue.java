package com.collection_api.quaue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class MaxElementInQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int max = findMax(queue);
        System.out.println("Max element is: " + max);
    }

    public static int findMax(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            throw new IllegalArgumentException("Queue is empty, no maximum element available.");
        }

        int max = Integer.MIN_VALUE;
        int size = queue.size();

        // Process each element in the queue once
        for (int i = 0; i < size; i++) {
            int current = queue.poll(); // Dequeue the front element
            max = Math.max(max, current); // Update max if current is larger
            queue.add(current); // Re-enqueue the element to maintain original order
        }

        return max;
    }
}
