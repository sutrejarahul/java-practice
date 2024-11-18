package com.collection_api.set.linked_hashset;

import java.util.LinkedHashSet;

public class RemovingElements {

    public static void main(String[] args) {
        // Create a LinkedHashSet of fruits
        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");
        fruits.add("Pineapple");
        fruits.add("Orange");
        fruits.add("Mango");

        // Remove "Apple" from the LinkedHashSet
        fruits.remove("Apple");
        System.out.println("Fruits after removing 'Apple': " + fruits);

        // Check if "Apple" is still present in the set
        System.out.println("Does the set contain 'Apple'? " + fruits.contains("Apple"));
    }
}
