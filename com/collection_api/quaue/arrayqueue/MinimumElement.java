package com.collection_api.quaue.arrayqueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class MinimumElement {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(4);
        queue.add(3);
        queue.add(2);
        queue.add(5);

        int minValue = findMinimum(queue);
        System.out.println("Minimum Value: " + minValue);
        System.out.println("Original Queue: " + queue);
    }

    // Method to find the minimum element in a queue
    public static int findMinimum(Queue<Integer> queue) {
        int minValue = Integer.MAX_VALUE;

        // Iterate over the queue to find the minimum value
        for (Integer i : queue) {
            minValue = Math.min(minValue, i);
        }
        return minValue;
    }
}

