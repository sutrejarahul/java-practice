package com.collection_api.list.stack;

import java.util.Stack;

public class StackSorter {

    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> auxiliaryStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            // Move elements from auxiliaryStack back to stack if they are larger than temp
            while (!auxiliaryStack.isEmpty() && auxiliaryStack.peek() > temp) {
                stack.push(auxiliaryStack.pop());
            }

            // Push the temp element to its correct position in auxiliaryStack
            auxiliaryStack.push(temp);
        }

        return auxiliaryStack; // auxiliaryStack is now sorted
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);
        Stack<Integer> sortedStack = sortStack(stack);
        System.out.println("Sorted Stack: " + sortedStack);
    }
}

