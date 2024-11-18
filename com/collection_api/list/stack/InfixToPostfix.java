package com.collection_api.list.stack;

import java.util.Stack;
import java.util.StringTokenizer;

public class InfixToPostfix {

    // Method to determine the precedence of operators
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3; // Exponentiation
            default:
                return -1;
        }
    }

    public static String infixToPostfix(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        // Tokenize the input expression
        StringTokenizer tokens = new StringTokenizer(expression, " +-*()/^", true);

        while (tokens.hasMoreTokens()) {
            String token = tokens.nextToken().trim();
            if (token.isEmpty()) continue; // Skip whitespace

            char c = token.charAt(0);
            if (Character.isLetterOrDigit(c)) {
                // If the token is an operand, add it to the output
                output.append(c);
            } else if (c == '(') {
                // If the token is '(', push it onto the stack
                stack.push(c);
            } else if (c == ')') {
                // If the token is ')', pop from the stack to output until '(' is found
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop());
                }
                stack.pop(); // Remove '(' from the stack
            } else { // The token is an operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    output.append(stack.pop());
                }
                stack.push(c); // Push the current operator onto the stack
            }
        }

        // Pop all the remaining operators in the stack
        while (!stack.isEmpty()) {
            output.append(stack.pop());
        }

        return output.toString();
    }

    public static void main(String[] args) {
        String infixExpression = "A + B * (C - D)";
        String postfixExpression = infixToPostfix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + postfixExpression); // "ABCD--*+"
    }
}

