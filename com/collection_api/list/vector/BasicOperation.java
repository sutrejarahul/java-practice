package com.collection_api.list.vector;

import java.util.Vector;

public class BasicOperation {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

        // Adding elements
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(1, 15); // Adding at specific index

        // Accessing elements
        System.out.println("Element at index 2: " + vector.get(2));

        // Modifying elements
        vector.set(1, 25);

        // Removing elements
        vector.remove(Integer.valueOf(20));
        vector.remove(2);

        // Iterating
        System.out.println("Iterating using forEach:");
        vector.forEach(System.out::println);

        // Capacity and Size
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // Checking other methods
        System.out.println("Contains 30: " + vector.contains(30));
        System.out.println("Is Empty: " + vector.isEmpty());
        System.out.println("Index of 15: " + vector.indexOf(15));

        // Clear Vector
        vector.clear();
        System.out.println("After clear, Vector: " + vector);
    }
}
