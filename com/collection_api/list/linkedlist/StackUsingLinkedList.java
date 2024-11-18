package com.collection_api.list.linkedlist;

import java.util.LinkedList;

public class StackUsingLinkedList {

    // Stack implemented using LinkedList
    private LinkedList<Integer> stack;

    // Constructor
    public StackUsingLinkedList() {
        stack = new LinkedList<>();
    }

    // Push an element onto the stack
    public void push(int element) {
        stack.addFirst(element);  // Adds to the beginning of the list (top of the stack)
        System.out.println("Pushed: " + element);
    }

    // Pop an element from the stack
    public Integer pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stack.removeFirst();  // Removes from the beginning of the list
        }
    }

    // Peek the top element of the stack
    public Integer peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return stack.getFirst();  // Retrieves the first element without removing it
        }
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Peek top element
        System.out.println("Top element: " + stack.peek());

        // Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        // Peek after pops
        System.out.println("Top element after pops: " + stack.peek());
    }
}
