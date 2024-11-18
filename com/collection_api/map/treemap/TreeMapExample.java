package com.collection_api.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding elements using put()
        treeMap.put(10, "Apple");
        treeMap.put(20, "Banana");
        treeMap.put(30, "Cherry");
        treeMap.put(40, "Date");

        // Displaying the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Accessing an element using get()
        System.out.println("Value for key 20: " + treeMap.get(20));

        // Checking if a key exists using containsKey()
        System.out.println("Contains key 30: " + treeMap.containsKey(30));

        // Checking if a value exists using containsValue()
        System.out.println("Contains value 'Date': " + treeMap.containsValue("Date"));

        // Removing an element using remove()
        treeMap.remove(10);
        System.out.println("After removing key 10: " + treeMap);

        // Getting the first entry using firstEntry()
        System.out.println("First entry: " + treeMap.firstEntry());

        // Getting the last entry using lastEntry()
        System.out.println("Last entry: " + treeMap.lastEntry());

        // Getting a submap using subMap()
        System.out.println("Submap (20 to 40): " + treeMap.subMap(20, 40));

        // Getting the key less than a specific key using lowerKey()
        System.out.println("Key less than 30: " + treeMap.lowerKey(30));

        // Getting the entry less than a specific key using lowerEntry()
        System.out.println("Entry less than 30: " + treeMap.lowerEntry(30));

        // Getting a key greater than a specific key using higherKey()
        System.out.println("Key greater than 20: " + treeMap.higherKey(20));

        // Getting the entry greater than a specific key using higherEntry()
        System.out.println("Entry greater than 20: " + treeMap.higherEntry(20));

        // Iterating over the TreeMap using for-each loop
        System.out.println("Iterating through TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Clearing all elements using clear()
        treeMap.clear();
        System.out.println("After clearing TreeMap: " + treeMap);
    }
}

