package com.collection_api.map.hashtable;

import java.util.Hashtable;
import java.util.Random;

public class UniqueIntegerCounter {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        Random random = new Random();

        // Populate hashtable with random integers
        for (int i = 1; i <= 10; i++) {
            int randomKey = random.nextInt(100);
            hashtable.put(randomKey, hashtable.getOrDefault(randomKey, 0) + 1);
        }

        // Display the count of unique integers
        System.out.println("Unique Integer Counts:");
        System.out.println("-----------------------");
        hashtable.forEach((key, value) -> System.out.printf("Key: %3d | Count: %d%n", key, value));
    }
}

