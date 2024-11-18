package com.collection_api.map.hashmap;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String string = "swiss";
        System.out.println("First Non Repeating Character: " + findFirstNonRepeatingCharacter(string));
    }

    public static char findFirstNonRepeatingCharacter(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        // Build frequency map
        for (char c : str.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeating character by checking the string order
        for (char c : str.toCharArray()) {
            if (hashMap.get(c) == 1) {
                return c;
            }
        }

        // Return a default value if no non-repeating character is found
        return '\0';  // Or you could return a message indicating no non-repeating character exists
    }
}

