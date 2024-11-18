package com.collection_api.quaue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class InterleaveTwoQueues {

    public static void main(String[] args) {
        // Initialize two queues
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);

        Queue<Integer> queue2 = new LinkedList<>();
        queue2.add(6);
        queue2.add(7);
        queue2.add(8);
        queue2.add(9);
        queue2.add(10);

        // Interleave the queues
        Queue<Integer> finalQueue = interleaveQueues(queue1, queue2);

        // Display the result
        System.out.println("Interleaved Queue: " + finalQueue);
    }

    public static Queue<Integer> interleaveQueues(Queue<Integer> queue1, Queue<Integer> queue2) {
        Queue<Integer> interleavedQueue = new LinkedList<>();

        // Interleave elements from both queues
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            if (!queue1.isEmpty()) {
                interleavedQueue.add(queue1.poll());
            }
            if (!queue2.isEmpty()) {
                interleavedQueue.add(queue2.poll());
            }
        }
        return interleavedQueue;
    }
}

