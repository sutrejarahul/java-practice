package com.collection_api.map.hashtable;

import java.util.Hashtable;

public class CharacterOccurrenceInString {

    public static void main(String[] args) {
        String sentence = "The sentence can be provided as a string, and each word should be stored as a key with its frequency as the value";

        // Convert sentence to lowercase and remove non-alphabetic characters
        char[] chars = sentence.toLowerCase().replaceAll("[^a-z]", "").toCharArray();

        // Hashtable to store character frequencies
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        for (char c : chars) {
            hashtable.put(c, hashtable.getOrDefault(c, 0) + 1);
        }

        // Printing the character frequencies
        System.out.println("Character Frequencies:");
        hashtable.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

