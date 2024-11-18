package com.collection_api.map.linkedhashmap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        String inputString = "frequency of each character";
        char[] chars = inputString.replace(" ", "").toCharArray();

        // Initialize LinkedHashMap to store character frequencies
        LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();

        // Count the frequency of each character
        for (char c : chars) {
            linkedHashMap.put(c, linkedHashMap.getOrDefault(c, 0) + 1);
        }

        // Print unsorted frequency map
        System.out.println("Character frequencies (unsorted):");
        linkedHashMap.forEach((key, value) -> System.out.println(key + " : " + value));

        // Sort the map by frequency in descending order
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(linkedHashMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Sort in descending order

        // Print the sorted frequency map
        System.out.println("\nCharacter frequencies (sorted by frequency):");
        for (Map.Entry<Character, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

