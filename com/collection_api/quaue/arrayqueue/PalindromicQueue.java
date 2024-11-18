package com.collection_api.quaue.arrayqueue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class PalindromicQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(2);
        queue.add(1);

        // Create a copy of the queue so we don't modify the original
        Queue<Integer> queueCopy = new ArrayDeque<>(queue);

        Stack<Integer> stack = new Stack<>();

        // Push elements of the queue into the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        boolean isPalindromicQueue = true;

        // Check if elements from queue copy match the stack (which is in reverse order)
        while (!queueCopy.isEmpty()) {
            if (!queueCopy.poll().equals(stack.pop())) {
                isPalindromicQueue = false;
                break;
            }
        }

        System.out.println("Queue is Palindromic? : " + isPalindromicQueue);
    }
}

