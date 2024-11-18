package com.collection_api.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class ReverseMapping {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Populating TreeMap with unique key-value pairs
        for (int i = 1; i <= 10; i++) {
            treeMap.put(i, "Student " + i);
        }

        System.out.println("Before reverse:");
        treeMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Reversing TreeMap by swapping keys and values
        TreeMap<String, Integer> reversedTreeMap = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            reversedTreeMap.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\nAfter reverse:");
        reversedTreeMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

