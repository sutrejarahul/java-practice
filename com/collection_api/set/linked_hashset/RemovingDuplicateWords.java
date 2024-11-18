package com.collection_api.set.linked_hashset;

import java.util.*;

public class RemovingDuplicateWords {

    public static void main(String[] args) {
        // Take input sentence from user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = s.nextLine();
        s.close(); // Close the scanner to free resources

        // Split sentence into words using whitespace
        String[] words = sentence.split("\\s+");

        // Normalize words by removing punctuation and converting to lowercase
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("\\W", "").toLowerCase();
        }

        // Use LinkedHashSet to store unique words while maintaining order
        LinkedHashSet<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

        // Join unique words back into a sentence format
        String result = String.join(" ", uniqueWords);
        System.out.println("Sentence with unique words: " + result);
    }
}
