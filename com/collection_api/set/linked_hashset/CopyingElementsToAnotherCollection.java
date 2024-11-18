package com.collection_api.set.linked_hashset;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class CopyingElementsToAnotherCollection {

    public static void main(String[] args) {
        // Initialize a LinkedHashSet with city names
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("Tokyo");
        set.add("New York");
        set.add("Dubai");

        // Copy elements from LinkedHashSet to ArrayList
        ArrayList<String> list = new ArrayList<>(set);

        // Display the copied ArrayList
        System.out.println("Copied elements in ArrayList: " + list);
    }
}
