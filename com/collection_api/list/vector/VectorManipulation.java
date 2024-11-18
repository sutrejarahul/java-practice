package com.collection_api.list.vector;

import java.util.*;

public class VectorManipulation {

    public static void main(String[] args) {
        // 1. Creating an integer vector and populating it with random values.
        Vector<Integer> vector = new Vector<>();
        Random random = new Random(); // Moved outside of the loop for efficiency

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(10); // Generate random integer between 0 and 9
            vector.add(randomNumber);
        }

        System.out.println("Original Vector: " + vector);

        int target = 2;
        List<Integer> indices = findIndices(vector, target);
        System.out.println("The target " + target + " is found at indices: " + indices);

        // Removing duplicate values
        removeDuplicateElements(vector);
        System.out.println("Vector after removing duplicates: " + vector);
    }

    public static List<Integer> findIndices(Vector<Integer> vector, int target) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < vector.size(); i++) {
            if (vector.get(i) == target) {
                indices.add(i);  // Add the index of the target element
            }
        }
        return indices;
    }

    public static void removeDuplicateElements(Vector<Integer> vector) {
        // Use LinkedHashSet to preserve insertion order and remove duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>(vector);

        // Clear the original vector and add unique elements back
        vector.clear();
        vector.addAll(set);
    }
}
