package com.collection_api.set.treeset;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(25);

        System.out.println("Initial TreeSet: " + treeSet);

        // Add duplicate (will not be added)
        treeSet.add(10);
        System.out.println("After trying to add duplicate 10: " + treeSet);

        // Remove an element
        treeSet.remove(15);
        System.out.println("After removing 15: " + treeSet);

        // Check if an element exists
        boolean contains10 = treeSet.contains(10);
        System.out.println("TreeSet contains 10: " + contains10);

        // Get first and last elements
        int first = treeSet.first();
        int last = treeSet.last();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);

        // Check if TreeSet is empty
        boolean isEmpty = treeSet.isEmpty();
        System.out.println("Is TreeSet empty: " + isEmpty);

        // Get the size of the TreeSet
        int size = treeSet.size();
        System.out.println("Size of TreeSet: " + size);

        // Retrieve elements less than a given element
        System.out.println("Elements less than 20: " + treeSet.headSet(20));

        // Retrieve elements greater than or equal to a given element
        System.out.println("Elements greater than or equal to 10: " + treeSet.tailSet(10));

        // Retrieve a subset (range of elements)
        System.out.println("Subset between 5 (inclusive) and 20 (exclusive): " + treeSet.subSet(5, 20));

        // Poll first and last elements (remove and return)
        System.out.println("Polling first element: " + treeSet.pollFirst());
        System.out.println("After polling first element: " + treeSet);
        System.out.println("Polling last element: " + treeSet.pollLast());
        System.out.println("After polling last element: " + treeSet);

        // Iterate over TreeSet
        System.out.print("TreeSet elements: ");
        for (Integer num : treeSet) {
            System.out.print(num + " ");
        }
    }
}

