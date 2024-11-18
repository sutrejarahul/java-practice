package com.collection_api.map.linkedhashmap;

import java.util.LinkedHashMap;

public class BasicOperations {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> peopleAges = new LinkedHashMap<>();

        // Adding initial entries
        peopleAges.put("Ervin", 65);
        peopleAges.put("Levie", 50);
        peopleAges.put("Eren", 25);
        peopleAges.put("Mikasha", 25);
        peopleAges.put("Rener", 30);

        // Display initial map
        System.out.println("Initial map:");
        peopleAges.forEach((key, value) -> System.out.println(key + " : " + value));

        // Update specific entries
        peopleAges.replace("Eren", 28);
        peopleAges.replace("Mikasha", 27);

        // Display updated map after modification
        System.out.println("Updated map after modifying ages:");
        peopleAges.forEach((key, value) -> System.out.println(key + " : " + value));

        // Remove an entry
        peopleAges.remove("Rener");

        // Display updated map after removal
        System.out.println("Updated map after removing 'Rener':");
        peopleAges.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

