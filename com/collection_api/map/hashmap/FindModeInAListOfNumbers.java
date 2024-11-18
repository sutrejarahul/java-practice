package com.collection_api.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class FindModeInAListOfNumbers {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 3, 4, 5, 3, 2};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // Step 1: Count the frequency of each element
        for (int num : numbers) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find the element with the highest frequency (mode)
        int mode = numbers[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mode = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("Mode: " + mode);
    }
}

