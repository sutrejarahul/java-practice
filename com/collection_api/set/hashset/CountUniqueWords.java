package com.collection_api.set.hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountUniqueWords {

    public static void main(String[] args) {
        String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn't really happy";

        int uniqueWordCount = countUniqueWords(sentence);
        System.out.println("Unique word count: " + uniqueWordCount);
    }

    public static int countUniqueWords(String sentence) {
        // Split sentence into words using whitespace
        String[] words = sentence.split("\\s+");

        // Normalize and remove punctuation
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\W", "").toLowerCase();
        }

        // Use HashSet to store unique words
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));

        // Display unique words (optional)
        uniqueWords.forEach(System.out::println);

        // Return the count of unique words
        return uniqueWords.size();
    }
}
