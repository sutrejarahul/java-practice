package com.collection_api.map.treemap;

import java.util.TreeMap;

public class MergingMaps {

    public static void main(String[] args) {

        // Creating and populating the first TreeMap
        TreeMap<Integer, String> fruitsMap = new TreeMap<>();
        fruitsMap.put(1, "Apple");
        fruitsMap.put(2, "Banana");
        fruitsMap.put(3, "Grapes");
        fruitsMap.put(4, "Cherry");
        fruitsMap.put(5, "Orange");

        System.out.println("Fruits Map:");
        fruitsMap.forEach((key, value) -> System.out.println(key + " : " + value));

        // Creating and populating the second TreeMap
        TreeMap<Integer, String> vegetablesMap = new TreeMap<>();
        vegetablesMap.put(6, "Potato");
        vegetablesMap.put(7, "Ladies Finger");
        vegetablesMap.put(8, "Onion");
        vegetablesMap.put(9, "Garlic");
        vegetablesMap.put(10, "Green Chilli");

        System.out.println("\nVegetables Map:");
        vegetablesMap.forEach((key, value) -> System.out.println(key + " : " + value));

        // Merging both TreeMaps into mergeMap
        TreeMap<Integer, String> mergeMap = new TreeMap<>(fruitsMap);
        mergeMap.putAll(vegetablesMap);

        // Optional: Handle duplicate keys by appending values (if any)
        // vegetablesMap.forEach((key, value) -> mergeMap.merge(key, value, (v1, v2) -> v1 + " & " + v2));

        System.out.println("\nMerged Map:");
        mergeMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

