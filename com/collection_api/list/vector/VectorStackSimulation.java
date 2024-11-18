package com.collection_api.list.vector;

import java.util.Scanner;
import java.util.Vector;

public class VectorStackSimulation {

    public static void main(String[] args) {
        // Create a Vector to simulate the stack
        Vector<String> stack = new Vector<>();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            // Menu for user interaction
            System.out.println("Choose an option:");
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Peek at top element");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Exit");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter a string to push:");
                    String element = scanner.nextLine();
                    push(stack, element);
                    break;
                case 2:
                    String poppedElement = pop(stack);
                    if (poppedElement != null) {
                        System.out.println("Popped: " + poppedElement);
                    }
                    break;
                case 3:
                    String topElement = peek(stack);
                    if (topElement != null) {
                        System.out.println("Top of stack: " + topElement);
                    }
                    break;
                case 4:
                    System.out.println("Is stack empty? " + isEmpty(stack));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (choice != 5);
    }

    // Method to push element into the stack
    public static void push(Vector<String> stack, String element) {
        stack.add(element);
        System.out.println(element + " pushed onto stack.");
    }

    // Method to pop element from the stack
    public static String pop(Vector<String> stack) {
        if (!isEmpty(stack)) {
            return stack.remove(stack.size() - 1);
        } else {
            System.out.println("Stack is empty, cannot pop.");
            return null;
        }
    }

    // Method to peek at the top element of the stack
    public static String peek(Vector<String> stack) {
        if (!isEmpty(stack)) {
            return stack.get(stack.size() - 1);
        } else {
            System.out.println("Stack is empty, nothing to peek.");
            return null;
        }
    }

    // Method to check if the stack is empty
    public static boolean isEmpty(Vector<String> stack) {
        return stack.isEmpty();
    }
}
