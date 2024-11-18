package com.collection_api.quaue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbersUsingQueue {

    public static void main(String[] args) {
        int n = 5; // Number of binary numbers to generate
        generateBinaryNumbers(n);
    }

    public static void generateBinaryNumbers(int n) {
        Queue<String> queue = new LinkedList<>();

        // Start with the binary representation of 1
        queue.add("1");

        System.out.println("Binary numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            // Dequeue the front binary number
            String current = queue.poll();
            System.out.println(current); // Print the current binary number

            // Generate the next numbers by appending "0" and "1"
            queue.add(current + "0");
            queue.add(current + "1");
        }
    }
}
