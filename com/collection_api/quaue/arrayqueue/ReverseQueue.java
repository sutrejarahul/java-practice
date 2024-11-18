package com.collection_api.quaue.arrayqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        // Populate the queue with sample values
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
        }

        System.out.println("Original Queue: " + queue);

        // Reverse the queue
        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }

    // Method to reverse a queue
    public static void reverseQueue(Queue<Integer> queue) {
        Deque<Integer> stack = new ArrayDeque<>();

        // Transfer elements from the queue to the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Transfer elements back to the queue, which reverses the order
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}

