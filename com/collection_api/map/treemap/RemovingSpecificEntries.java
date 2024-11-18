package com.collection_api.map.treemap;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class RemovingSpecificEntries {

    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        Random random = new Random();

        // Populate the TreeMap with random entries
        for(int i = 1; i <= 10; i++) {
            treeMap.put(random.nextInt(100), "Item " + i);
        }

        System.out.println("Initial Map:");
        printMap(treeMap);

        // Removing entries with keys greater than 50
        System.out.println("\nAfter removing entries with keys greater than 50:");
        treeMap.entrySet().removeIf(entry -> entry.getKey() > 50);
        printMap(treeMap);
    }

    // Method to print TreeMap entries
    private static void printMap(TreeMap<Integer, String> map) {
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

