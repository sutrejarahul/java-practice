package com.collection_api.list.stack;

import java.util.Stack;

public class MinStack {
    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push(0L);  // Push the value as 0 because the stack is empty
            min = x;         // Initialize min with x
        } else {
            stack.push(x - min);  // Store difference
            if (x < min) {
                min = x;          // Update min
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }

        long top = stack.pop();

        // If top is negative, it means the popped value was the minimum
        if (top < 0) {
            min = min - top; // Restore previous minimum
        }
    }

    public int top() {
        long top = stack.peek();

        // If top is negative, the current top is the minimum value
        if (top < 0) {
            return (int) min;
        } else {
            // Otherwise, add the difference to the minimum to get the original value
            return (int) (min + top);
        }
    }

    public int getMin() {
        return (int) min;
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Current Min: " + minStack.getMin()); // 2
        minStack.pop();
        System.out.println("Current Min after pop: " + minStack.getMin()); // 3
        System.out.println("Top element: " + minStack.top()); // 7
    }
}

