package com.collection_api.list.stack;

import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElement {

    public static int[] findNextGreaterElements(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        // Traverse the array from the end to the start
        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop elements from the stack that are not greater than the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If the stack is empty, no greater element to the right
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek(); // The next greater element
            }

            // Push the current element onto the stack
            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10};
        int[] result = findNextGreaterElements(arr);
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Next Greater Elements: " + Arrays.toString(result)); // [5, 10, 10, -1]
    }
}

