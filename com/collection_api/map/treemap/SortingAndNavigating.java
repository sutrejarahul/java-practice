package com.collection_api.map.treemap;

import java.util.TreeMap;

public class SortingAndNavigating {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        int count = 5;

        // Adding entries to TreeMap
        for(int i = 1; i <= 20; i++) {
            treeMap.put(count, "Employee " + i);
            count += 5;
        }

        // Printing the entire TreeMap
        System.out.println("Full TreeMap:");
        treeMap.forEach((key, value) -> System.out.println(key + " : " + value));

        // Displaying the first and last entries
        System.out.println("\nFirst entry: " + treeMap.firstEntry());
        System.out.println("Last entry: " + treeMap.lastEntry());

        // Displaying a submap from key 15 to 50 (exclusive)
        System.out.println("\nSubMap from 15 to 50:");
        treeMap.subMap(15, 50).forEach((key, value) -> System.out.println(key + " : " + value));

        // Finding keys lower and higher than a specific key
        Integer lowerKey = treeMap.lowerKey(25);
        Integer higherKey = treeMap.higherKey(25);

        System.out.println("\nLower Key than 25: " + (lowerKey != null ? lowerKey : "None"));
        System.out.println("Higher Key than 25: " + (higherKey != null ? higherKey : "None"));
    }
}

