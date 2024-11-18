package com.collection_api.set.linked_hashset;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountingUniqueCharacters {

    public static void main(String[] args) {
        // Take input sentence from user
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = s.nextLine().replaceAll("\\W", "").toLowerCase();
        s.close(); // Close the scanner to free resources

        // Convert the sentence into a list of characters
        List<Character> characters = convertStringToCharList(sentence);

        // Store unique characters in insertion order
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>(characters);

        // Display unique characters and their count
        System.out.println("Unique characters: " + uniqueChars);
        System.out.println("Total unique characters: " + uniqueChars.size());
    }

    // Function to convert a String to a List of Characters
    public static List<Character> convertStringToCharList(String str) {
        // Convert String to IntStream, then to Stream<Character>, and collect as a List
        return str
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());
    }
}
