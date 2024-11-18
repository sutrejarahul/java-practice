package com.collection_api.list.stack;
import java.util.Stack;

public class PostfixEvaluator {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (String token : expression.split("\\s+")) {
            // Check if the token is a number
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                // Token is an operator, so pop two operands
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = performOperation(operand1, operand2, token);
                stack.push(result);
            }
        }

        // The result of the expression is the last element in the stack
        return stack.pop();
    }

    // Helper function to check if a string is a number
    private static boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Helper function to perform the operation
    private static int performOperation(int operand1, int operand2, String operator) {
        return switch (operator) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> throw new IllegalArgumentException("Unknown operator: " + operator);
        };
    }

    public static void main(String[] args) {
        String expression = "5 6 + 3 *";
        int result = evaluatePostfix(expression);
        System.out.println("Result of postfix expression '" + expression + "': " + result); // 33
    }
}

