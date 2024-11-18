package com.collection_api.map.linkedhashmap;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        // put() - Adds key-value pair to the map
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // putIfAbsent() - Adds the key-value pair only if the key is not already present
        map.putIfAbsent("Apple", 10);  // Apple already exists, so value won't be updated

        // get() - Retrieves the value for a given key
        System.out.println("Apple: " + map.get("Apple"));  // Output: Apple: 1

        // remove() - Removes the key-value pair for the given key
        map.remove("Banana");

        // containsKey() - Checks if a key exists in the map
        System.out.println("Contains 'Banana'? " + map.containsKey("Banana"));  // Output: false

        // containsValue() - Checks if a value exists in the map
        System.out.println("Contains value 3? " + map.containsValue(3));  // Output: true

        // size() - Returns the number of key-value pairs
        System.out.println("Size: " + map.size());  // Output: Size: 2

        // isEmpty() - Checks if the map is empty
        System.out.println("Is map empty? " + map.isEmpty());  // Output: false

        // clear() - Removes all key-value pairs
        map.clear();
        System.out.println("Map after clear: " + map);  // Output: Map after clear: {}

        // Adding values again after clearing the map
        map.put("Mango", 4);
        map.put("Peach", 5);

        // entrySet() - Returns a set view of the map's entries
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println("Entries: " + entrySet);  // Output: Entries: [Mango=4, Peach=5]

        // keySet() - Returns a set view of the map's keys
        Set<String> keySet = map.keySet();
        System.out.println("Keys: " + keySet);  // Output: Keys: [Mango, Peach]

        // values() - Returns a collection view of the map's values
        Collection<Integer> values = map.values();
        System.out.println("Values: " + values);  // Output: Values: [4, 5]

        // forEach() - Iterates over each key-value pair
        map.forEach((key, value) -> System.out.println(key + ": " + value));
        // Output:
        // Mango: 4
        // Peach: 5

        // getOrDefault() - Returns the value for a given key, or a default value if the key does not exist
        System.out.println("Orange: " + map.getOrDefault("Orange", 0));  // Output: Orange: 0

        // replace() - Replaces the value for the specified key
        map.replace("Mango", 10);
        System.out.println("Mango after replace: " + map.get("Mango"));  // Output: Mango after replace: 10

        // replaceAll() - Replaces all values in the map using a provided lambda expression
        map.replaceAll((key, value) -> value * 2);
        System.out.println("After replaceAll: " + map);  // Output: After replaceAll: {Mango=20, Peach=10}
    }
}

