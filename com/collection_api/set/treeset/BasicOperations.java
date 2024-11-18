package com.collection_api.set.treeset;

import java.util.TreeSet;

public class BasicOperations {

    public static void main(String[] args) {
        // Create a TreeSet of city names
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("London");
        treeSet.add("Paris");
        treeSet.add("Tokyo");
        treeSet.add("New York");
        treeSet.add("Dubai");

        // Print all elements in ascending order
        System.out.println("Initial TreeSet: " + treeSet);

        // Check if "Alice" exists in the TreeSet
        boolean isAlicePresent = treeSet.contains("Alice");
        System.out.println("Is 'Alice' present in the TreeSet? " + isAlicePresent);

        // Remove "Dubai" and print updated set
        boolean isRemoved = treeSet.remove("Dubai");
        System.out.println("Is 'Dubai' removed? " + isRemoved);
        System.out.println("TreeSet after removing 'Dubai': " + treeSet);

        // Retrieve and print the first and last elements
        String firstElement = treeSet.first();
        System.out.println("First element: " + firstElement);

        String lastElement = treeSet.last();
        System.out.println("Last element: " + lastElement);
    }
}
