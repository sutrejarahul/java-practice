package com.collection_api.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Adding entries to the map
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // Accessing values
        System.out.println("Bob's age: " + map.get("Bob"));

        // Checking for key existence
        if (map.containsKey("Alice")) {
            System.out.println("Alice is in the map.");
        }

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

