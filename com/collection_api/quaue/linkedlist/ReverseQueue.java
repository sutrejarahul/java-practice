package com.collection_api.quaue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {

    public static void main(String[] args) {
        // 1. Initialize the queue
        Queue<Integer> queue = new LinkedList<>();

        // 2. Enqueue elements
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Original Queue: " + queue);

        // Reverse the queue using a stack
        reverseQueue(queue);

        System.out.println("Reversed Queue: " + queue);
    }

    // Method to reverse the queue
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Transfer elements from queue to stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Transfer elements back to queue in reversed order
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}

