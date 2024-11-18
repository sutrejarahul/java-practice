package com.collection_api.map.hashtable;

import java.util.Hashtable;

public class WordFrequencyCounter {

    public static void main(String[] args) {
        String sentence = "The sentence can be provided as a string, and each word should be stored as a key with its frequency as the value";
        String[] words = sentence.toLowerCase().replaceAll("[^a-zA-Z ]", "").split(" ");

        Hashtable<String, Integer> hashtable = new Hashtable<>();
        for (String word : words) {
            hashtable.put(word, hashtable.getOrDefault(word, 0) + 1);
        }

        // Printing the word frequencies
        System.out.println("Word frequencies in Hashtable:");
        hashtable.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
