package com.collection_api.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // 2. put() - Add key-value pairs
        map.put("Alice", 30);
        map.put("Bob", 25);
        map.put("Charlie", 35);

        // 3. get() - Retrieve a value by key
        System.out.println("Age of Alice: " + map.get("Alice"));

        // 4. remove() - Remove a key-value pair
        map.remove("Bob");
        System.out.println("Map after removing Bob: " + map);

        // 5. containsKey() - Check if a key exists
        System.out.println("Does map contain 'Alice' as a key? " + map.containsKey("Alice"));

        // 6. containsValue() - Check if a value exists
        System.out.println("Does map contain '25' as a value? " + map.containsValue(25));

        // 7. size() - Get the number of key-value pairs
        System.out.println("Size of map: " + map.size());

        // 8. isEmpty() - Check if the map is empty
        System.out.println("Is the map empty? " + map.isEmpty());

        // 9. clear() - Remove all elements from the map
        map.clear();
        System.out.println("Map after clear: " + map);

        // Re-add entries for further examples
        map.put("Dave", 40);
        map.put("Eve", 45);

        // 10. replace() - Replace the value for a specific key
        map.replace("Eve", 50);
        System.out.println("Map after replacing Eve's age: " + map);

        // 11. putIfAbsent() - Add a key-value pair if the key is not already present
        map.putIfAbsent("Alice", 30);
        System.out.println("Map after putIfAbsent for Alice: " + map);

        // 12. Iterating through the HashMap
        System.out.println("Iterating through map entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Using forEach to iterate
        System.out.println("Using forEach to iterate:");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
    }
}

