package com.collection_api.list.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements2 {

    public static void main(String[] args) {
        // 1. Creating an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("banana");

        // Create a HashMap to store the frequency of elements
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Iterate through the ArrayList
        for (String element : list) {
            if (frequencyMap.containsKey(element)) {
                // If element is already in the map, increment its count
                frequencyMap.put(element, frequencyMap.get(element) + 1);
            } else {
                // If element is not in the map, add it with count 1
                frequencyMap.put(element, 1);
            }
        }

        // Print the frequency of each element
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
