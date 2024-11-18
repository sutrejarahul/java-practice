package com.collection_api.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccessOrderExample {

    public static void main(String[] args) {
        // Create a LinkedHashMap with access-order by setting the third parameter to true
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);

        // Add entries to the map
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);
        linkedHashMap.put("Four", 4);
        linkedHashMap.put("Five", 5);

        // Print initial map order (insertion order)
        System.out.println("Initial map (insertion order):");
        printMap(linkedHashMap);

        // Access some entries
        linkedHashMap.get("Three");  // Access "Three"
        linkedHashMap.get("One");    // Access "One"
        linkedHashMap.get("Four");   // Access "Four"

        // Print map after accessing certain elements to see the access order
        System.out.println("\nMap after accessing 'Three', 'One', and 'Four' (access order):");
        printMap(linkedHashMap);
    }

    // Utility method to print the map
    private static void printMap(Map<String, Integer> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

