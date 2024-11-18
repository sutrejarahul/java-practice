package com.collection_api.map.hashmap;

import java.util.HashMap;

public class CountWordFrequency {

    public static void main(String[] args) {
        String sentence = "hello world hello everyone";
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] array = sentence.split(" ");

        // Loop to count occurrences of each word
        for (String str : array) {
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        }

        // Print each word and its frequency
        hashMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

