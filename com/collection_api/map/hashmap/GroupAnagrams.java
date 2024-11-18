package com.collection_api.map.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] words = {"listen", "silent", "enlist", "hello", "loleh"};
        List<List<String>> groupedAnagrams = groupAnagrams(words);
        System.out.println("Grouped Anagrams: " + groupedAnagrams);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            // Sort the word to use as the key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            // Add the word to the correct group in the map
            map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(word);
        }

        // Return all values in the map as a list of lists
        return new ArrayList<>(map.values());
    }
}

