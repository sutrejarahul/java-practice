package com.collection_api.map.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ComparePerformance {

    public static void main(String[] args) {
        final int numEntries = 1000000;

        // Measure insertion time for HashMap
        Map<Integer, Integer> hashMap = new HashMap<>();
        long hashMapInsertionTime = measureInsertionTime(hashMap, numEntries);
        System.out.println("HashMap insertion time: " + hashMapInsertionTime + " ms");

        // Measure insertion time for LinkedHashMap
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        long linkedHashMapInsertionTime = measureInsertionTime(linkedHashMap, numEntries);
        System.out.println("LinkedHashMap insertion time: " + linkedHashMapInsertionTime + " ms");

        // Measure retrieval time for HashMap
        long hashMapRetrievalTime = measureRetrievalTime(hashMap, numEntries);
        System.out.println("HashMap retrieval time: " + hashMapRetrievalTime + " ms");

        // Measure retrieval time for LinkedHashMap
        long linkedHashMapRetrievalTime = measureRetrievalTime(linkedHashMap, numEntries);
        System.out.println("LinkedHashMap retrieval time: " + linkedHashMapRetrievalTime + " ms");

        // Measure iteration time for HashMap
        long hashMapIterationTime = measureIterationTime(hashMap);
        System.out.println("HashMap iteration time: " + hashMapIterationTime + " ms");

        // Measure iteration time for LinkedHashMap
        long linkedHashMapIterationTime = measureIterationTime(linkedHashMap);
        System.out.println("LinkedHashMap iteration time: " + linkedHashMapIterationTime + " ms");
    }

    // Method to measure insertion time
    private static long measureInsertionTime(Map<Integer, Integer> map, int numEntries) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numEntries; i++) {
            map.put(i, i);
        }
        return System.currentTimeMillis() - startTime;
    }

    // Method to measure retrieval time
    private static long measureRetrievalTime(Map<Integer, Integer> map, int numEntries) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numEntries; i++) {
            map.get(i);
        }
        return System.currentTimeMillis() - startTime;
    }

    // Method to measure iteration time
    private static long measureIterationTime(Map<Integer, Integer> map) {
        long startTime = System.currentTimeMillis();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
        }
        return System.currentTimeMillis() - startTime;
    }
}

