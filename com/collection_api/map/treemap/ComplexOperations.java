package com.collection_api.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class ComplexOperations {

    public static void main(String[] args) {
        String string = "hello world";

        // Replace spaces and convert the string to a character array
        char[] chars = string.replace(" ", "").toCharArray();

        // Count the frequency of each character
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        for (char c : chars) {
            treeMap.put(c, treeMap.getOrDefault(c, 0) + 1);
        }

        System.out.println("Character Frequencies: " + treeMap);

        // Find and print the character with the highest frequency
        Character highFrequencyChar = getHighFrequencyCharacter(treeMap);
        if (highFrequencyChar != null) {
            System.out.println("Character with the highest frequency: " + highFrequencyChar +
                    " (Frequency: " + treeMap.get(highFrequencyChar) + ")");
        } else {
            System.out.println("No characters found.");
        }
    }

    // Method to find the character with the highest frequency
    public static Character getHighFrequencyCharacter(TreeMap<Character, Integer> map) {
        Character maxChar = null;
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                maxChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        return maxChar;
    }
}

