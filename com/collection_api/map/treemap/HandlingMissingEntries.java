package com.collection_api.map.treemap;

import java.util.TreeMap;

public class HandlingMissingEntries {

    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populating TreeMap with initial key-value pairs
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(3, "Grapes");
        treeMap.put(4, "Cherry");
        treeMap.put(5, "Orange");

        System.out.println("Original Map:");
        treeMap.forEach((key, value) -> System.out.println(key + " : " + value));

        System.out.println("\nChecking if key exists:");
        // getOrDefault() - Returns the value for a given key, or a default value if the key does not exist
        System.out.println("6 : " + treeMap.getOrDefault(6, "Not Found"));  // Output: 6 : Not Found

        // computeIfAbsent() - Adds a new entry only if the specified key is absent
        treeMap.computeIfAbsent(6, key -> "Water Melon");

        System.out.println("\nUpdated Map:");
        treeMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

