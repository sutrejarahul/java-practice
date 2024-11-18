package com.collection_api.map.treemap;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class KeyValueIterationAndTransformation {

    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Populating TreeMap with random scores
        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            treeMap.put("Student " + i, random.nextInt(100));  // Random score between 0 and 99
        }

        System.out.println("Original TreeMap:");
        treeMap.forEach((key, value) -> System.out.println(key + " : " + value));

        // Transforming TreeMap based on threshold
        treeMap = filterByThreshold(treeMap, 10);

        System.out.println("\nUpdated TreeMap (values above threshold):");
        treeMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    // Method to filter TreeMap entries based on threshold
    public static TreeMap<String, Integer> filterByThreshold(TreeMap<String, Integer> map, int threshold) {
        return map.entrySet().stream()
                .filter(entry -> entry.getValue() > threshold)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        TreeMap::new
                ));
    }
}

