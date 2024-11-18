package com.collection_api.set.linked_hashset;

import java.util.LinkedHashSet;

public class IterationAndRemoval {

    public static void main(String[] args) {
        // Create a LinkedHashSet and add city names
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("Tokyo");
        set.add("New York");
        set.add("Dubai");

        // Remove elements that start with the letter 'B'
        set.removeIf(e -> e.charAt(0) == 'B');

        // Print the final set after removal of specific elements
        System.out.println("Final set after removing elements starting with 'B': " + set);
    }
}
