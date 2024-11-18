package com.collection_api.list.stack;

import java.util.Stack;

public class BalancedParentheses {

    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char c : expression.toCharArray()) {
            // If opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If closing bracket, check if it matches the top of the stack
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening bracket
                }
                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false; // Mismatched pair
                }
            }
        }
        return stack.isEmpty(); // Balanced if stack is empty at the end
    }

    // Helper function to check if two characters are a matching pair
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String expression1 = "({[]})";
        String expression2 = "(]";

        System.out.println("Is '" + expression1 + "' balanced? " + isBalanced(expression1)); // true
        System.out.println("Is '" + expression2 + "' balanced? " + isBalanced(expression2)); // false
    }
}
