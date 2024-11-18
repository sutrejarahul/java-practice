package com.collection_api.map.linkedhashmap;

import java.util.LinkedHashMap;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String sentence = "Every morning she woke up early made coffee and read the newspaper the same routine day after day";
        String[] array = sentence.split(" ");
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Use LinkedHashMap to store unique words, with dummy values
        for (String word : array) {
            linkedHashMap.put(word, 1);
        }

        // Display the unique words in order
        System.out.println("Unique words in order:");
        System.out.println(linkedHashMap);
    }
}
