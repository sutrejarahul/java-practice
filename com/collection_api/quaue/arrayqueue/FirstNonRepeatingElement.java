package com.collection_api.quaue.arrayqueue;


import java.util.*;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(Arrays.asList(5, 3, 5, 2, 3, 6));

        System.out.println("Queue: " + queue);
        System.out.println("First Non-Repeating Element: " + findFirstNonRepeating(queue));
    }

    // Method to find the first non-repeating element
    public static Integer findFirstNonRepeating(Queue<Integer> queue) {
        // Create a map to store the frequency of elements
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in the queue
        for (Integer num : queue) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Traverse through the queue to find the first non-repeating element
        for (Integer num : queue) {
            if (frequencyMap.get(num) == 1) {
                return num; // Return the first non-repeating element
            }
        }

        return null; // Return null if no non-repeating element is found
    }
}

