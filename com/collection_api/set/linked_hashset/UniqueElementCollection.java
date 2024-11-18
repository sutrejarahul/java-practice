package com.collection_api.set.linked_hashset;

import java.util.LinkedHashSet;

public class UniqueElementCollection {

    public static void main(String[] args) {
        // Create a LinkedHashSet of Integers
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet, including a duplicate (1)
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(1); // Duplicate, should be ignored

        // Print the LinkedHashSet to show unique elements in insertion order
        System.out.println("Unique elements in LinkedHashSet: " + linkedHashSet);
    }
}
