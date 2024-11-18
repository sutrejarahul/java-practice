package com.collection_api.map.hashmap;

import java.util.HashMap;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String string = "programming";
        char[] chars = string.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        // Count occurrences of each character
        for (char c : chars) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        // Print only duplicate characters
        System.out.println("Duplicate characters:");
        hashMap.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + " : " + value);
            }
        });
    }
}

