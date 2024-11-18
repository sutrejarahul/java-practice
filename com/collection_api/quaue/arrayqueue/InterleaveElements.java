package com.collection_api.quaue.arrayqueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class InterleaveElements {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= 6; i++) {
            queue.add(i);
        }

        System.out.println("Original Queue: " + queue);

        if (queue.size() % 2 != 0) {
            System.out.println("The queue must contain an even number of elements to interleave.");
            return;
        }

        interleaveQueue(queue);

        System.out.println("Interleaved Queue: " + queue);
    }

    // Method to interleave the elements of the queue
    public static void interleaveQueue(Queue<Integer> queue) {
        Queue<Integer> firstHalf = new ArrayDeque<>();
        int halfSize = queue.size() / 2;

        // Split the queue into two halves
        for (int i = 0; i < halfSize; i++) {
            firstHalf.add(queue.poll());
        }

        // Interleave elements from both halves back into the original queue
        while (!firstHalf.isEmpty()) {
            queue.add(firstHalf.poll());
            queue.add(queue.poll());
        }
    }
}
