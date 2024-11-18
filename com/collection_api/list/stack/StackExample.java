package com.collection_api.list.stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // 1. Push elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack);

        // 2. Peek the top element
        System.out.println("Top element (peek): " + stack.peek());

        // 3. Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // 4. Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // 5. Get the size of the stack
        System.out.println("Stack size: " + stack.size());

        // 6. Search for an element in the stack
        int position = stack.search(20);  // Position is 1-based from top
        System.out.println("Position of element 20 (from top): " + (position == -1 ? "not found" : position));

        // 7. Clear the stack (optional)
        stack.clear();
        System.out.println("Stack after clear: " + stack);
    }
}
