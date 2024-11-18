package com.collection_api.list.vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class VectorOfIntegers {

    public static void main(String[] args) {
        // 1. Creating a Vector of integers.
        Vector<Integer> vector = new Vector<>();

        // 2. Adding numbers from 1 to 10 to the vector.
        for (int i = 1; i <= 10; i++) {
            vector.add(i);
        }

        // 3. Using an iterator to display all elements in the vector.
        System.out.println("Elements in the Vector:");
        Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 4. Finding the maximum and minimum values in the vector.
        int max = Collections.max(vector);
        int min = Collections.min(vector);
        System.out.println("Minimum value in the Vector: " + min);
        System.out.println("Maximum value in the Vector: " + max);

        // 5. Removing all even numbers from the vector.
        vector.removeIf(i -> i % 2 == 0);
        System.out.println("After removing even numbers, the updated vector:");
        System.out.println(vector);
    }
}
