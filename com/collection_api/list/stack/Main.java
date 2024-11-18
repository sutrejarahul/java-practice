package com.collection_api.list.stack;

import java.util.Stack;

class CustomStack {
    private Stack<Integer> mainStack;
    private Stack<Integer> maxStack;

    public CustomStack() {
        mainStack = new Stack<>();
        maxStack = new Stack<>();
    }

    // Push element onto the stack
    public void push(int value) {
        mainStack.push(value);
        // Push onto max stack if it's empty or the value is greater than or equal to the current max
        if (maxStack.isEmpty() || value >= maxStack.peek()) {
            maxStack.push(value);
        }
    }

    // Pop the top element from the stack
    public int pop() {
        if (mainStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        int value = mainStack.pop();
        // If the popped value is the current max, pop it from the max stack as well
        if (value == maxStack.peek()) {
            maxStack.pop();
        }
        return value;
    }

    // Get the maximum element in the stack
    public int getMax() {
        if (maxStack.isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return maxStack.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    // Get the size of the stack
    public int size() {
        return mainStack.size();
    }
}

public class Main {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();

        customStack.push(5);
        System.out.println("Max: " + customStack.getMax()); // Max: 5

        customStack.push(1);
        System.out.println("Max: " + customStack.getMax()); // Max: 5

        customStack.push(3);
        System.out.println("Max: " + customStack.getMax()); // Max: 5

        customStack.push(7);
        System.out.println("Max: " + customStack.getMax()); // Max: 7

        customStack.pop();
        System.out.println("Max: " + customStack.getMax()); // Max: 5

        customStack.pop();
        customStack.pop();
        System.out.println("Max: " + customStack.getMax()); // Max: 5

        customStack.pop();
        // Uncommenting the next line will throw an exception
        // System.out.println("Max: " + customStack.getMax()); // Stack is empty exception
    }
}

