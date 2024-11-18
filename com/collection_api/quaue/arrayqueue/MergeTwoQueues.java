package com.collection_api.quaue.arrayqueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class MergeTwoQueues {

    // Method to merge two queues
    public static Queue<Integer> mergeQueues(Queue<Integer> first, Queue<Integer> second) {
        Queue<Integer> mergedQueue = new ArrayDeque<>();

        // Merge the queues by alternating elements
        while (!first.isEmpty() || !second.isEmpty()) {
            if (!first.isEmpty()) {
                mergedQueue.add(first.poll());
            }
            if (!second.isEmpty()) {
                mergedQueue.add(second.poll());
            }
        }
        return mergedQueue;
    }

    public static void main(String[] args) {

        // Initialize the first queue
        Queue<Integer> first = new ArrayDeque<>();
        first.add(1);
        first.add(2);
        first.add(3);

        // Initialize the second queue
        Queue<Integer> second = new ArrayDeque<>();
        second.add(4);
        second.add(5);
        second.add(6);

        // Merge the two queues using the helper method
        Queue<Integer> mergedQueue = mergeQueues(first, second);

        // Output the merged queue
        System.out.println("Merged Queue: " + mergedQueue);
    }
}

