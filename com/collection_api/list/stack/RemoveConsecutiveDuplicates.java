package com.collection_api.list.stack;

import java.util.Stack;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            // Only add character to the stack if it is different from the last added
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            }
        }

        // Build the resulting string from the stack
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "aabbcc";
        String result = removeConsecutiveDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("After Removing Consecutive Duplicates: " + result); // "abc"
    }
}

