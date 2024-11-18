package com.collection_api.list.stack;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String string = "Hello";
        Stack<Character> stack = new Stack<>();

        // Push characters onto the stack
        for (char c : string.toCharArray()) {
            stack.push(c);
        }

        // Pop characters to form the reversed string
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }

        System.out.println("Original String: " + string);
        System.out.println("Reversed String: " + reversedString.toString());
    }
}
