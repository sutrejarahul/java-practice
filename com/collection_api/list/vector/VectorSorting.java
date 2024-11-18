package com.collection_api.list.vector;

import java.util.Vector;
import java.util.Random;

public class VectorSorting {

    public static void main(String[] args) {
        // 1. Create a Vector of integers
        Vector<Integer> vector = new Vector<>();
        Random random = new Random();

        // Adding random integers to the vector
        for (int i = 0; i < 10; i++) {
            vector.add(random.nextInt(100)); // Random numbers between 0 and 99
        }

        // 2. Print the vector before sorting
        System.out.println("Vector before sorting: " + vector);

        // 3. Sort the vector using bubble sort
        bubbleSort(vector);

        // 4. Print the vector after sorting
        System.out.println("Vector after sorting: " + vector);
    }

    // Bubble sort algorithm to sort the vector in ascending order
    public static void bubbleSort(Vector<Integer> vector) {
        int n = vector.size();
        boolean swapped;

        // Perform bubble sort
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (vector.get(j) > vector.get(j + 1)) {
                    // Swap elements
                    int temp = vector.get(j);
                    vector.set(j, vector.get(j + 1));
                    vector.set(j + 1, temp);
                    swapped = true;
                }
            }
            // If no elements were swapped, the vector is already sorted
            if (!swapped) break;
        }
    }
}
