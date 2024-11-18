package com.collection_api.map.hashtable;


import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        // Adding key-value pairs using put()
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Cherry");
        hashtable.put(4, "Date");

        System.out.println("Initial Hashtable: " + hashtable);

        // Accessing an element using get()
        String value = hashtable.get(2);
        System.out.println("Value for key 2: " + value);

        // Checking if a key or value exists
        boolean hasKey = hashtable.containsKey(3);
        boolean hasValue = hashtable.contains("Cherry");
        System.out.println("Hashtable contains key 3: " + hasKey);
        System.out.println("Hashtable contains value 'Cherry': " + hasValue);

        // Removing a key-value pair using remove()
        hashtable.remove(4);
        System.out.println("After removing key 4: " + hashtable);

        // Checking the size of the Hashtable
        int size = hashtable.size();
        System.out.println("Size of Hashtable: " + size);

        // Iterating over keys using keys() method
        System.out.println("Keys in Hashtable:");
        Enumeration<Integer> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + hashtable.get(key));
        }

        // Iterating over values using elements() method
        System.out.println("Values in Hashtable:");
        Enumeration<String> values = hashtable.elements();
        while (values.hasMoreElements()) {
            System.out.println("Value: " + values.nextElement());
        }

        // Replacing a value using replace()
        hashtable.replace(2, "Blueberry");
        System.out.println("After replacing value at key 2: " + hashtable);

        // Using putIfAbsent() to add a key-value pair if the key is not already present
        hashtable.putIfAbsent(3, "Cranberry");
        System.out.println("After putIfAbsent on key 3: " + hashtable);

        // Using compute() to modify value associated with a key
        hashtable.compute(1, (k, v) -> v + " Pie");
        System.out.println("After compute on key 1: " + hashtable);

        // Using computeIfAbsent() to add value if the key is missing
        hashtable.computeIfAbsent(5, k -> "Elderberry");
        System.out.println("After computeIfAbsent on key 5: " + hashtable);

        // Using computeIfPresent() to modify value if the key is present
        hashtable.computeIfPresent(2, (k, v) -> v.toUpperCase());
        System.out.println("After computeIfPresent on key 2: " + hashtable);

        // Getting a set view of the keys
        Set<Integer> keySet = hashtable.keySet();
        System.out.println("Key set: " + keySet);

        // Getting a collection view of the values
        Collection<String> valueCollection = hashtable.values();
        System.out.println("Values collection: " + valueCollection);

        // Getting a set view of the entries
        Set<Map.Entry<Integer, String>> entrySet = hashtable.entrySet();
        System.out.println("Entry set: " + entrySet);

        // Clearing the Hashtable
        hashtable.clear();
        System.out.println("After clearing: " + hashtable);
    }
}

