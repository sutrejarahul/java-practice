package com.collection_api.map.treemap;

import java.util.TreeMap;

public class BasicOperations {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put(10, "Apple");
        treeMap.put(20, "Banana");
        treeMap.put(30, "Orange");
        treeMap.put(40, "Cherry");
        treeMap.put(50, "Grapes");

        // Getting the value associated with key 30
        System.out.println("Value for key 30: " + treeMap.get(30));

        // Checking if the TreeMap contains a specific key and value
        System.out.println("Contains key 60? " + treeMap.containsKey(60));
        System.out.println("Contains value 'Water Melon'? " + treeMap.containsValue("Water Melon"));

        // Removing the entry with key 50 (and associated value "Grapes")
        treeMap.remove(50);
        System.out.println("TreeMap after removing key 50: " + treeMap);
    }
}

