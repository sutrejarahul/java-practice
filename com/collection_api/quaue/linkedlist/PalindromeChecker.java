package com.collection_api.quaue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {
        String string = "RAR";
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push characters
        for (char c : string.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        System.out.println("Original Queue: " + queue);

        // Check if the queue matches the reverse order of the stack
        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }

        // Output the result
        if (isPalindrome) {
            System.out.println("String is a Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }
    }
}

