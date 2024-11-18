package com.collection_api.map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindCommonElementsInTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // Step 1: Store elements from the first array in the HashMap
        for(int i=0; i<array1.length; i++) {
            hashMap.put(i, array1[i]); // Storing the element with a dummy value (true)
        }

        // Step 2: Check elements of the second array against the HashMap
        List<Integer> list = new ArrayList<>();
        for(int i : array2) {
            if(hashMap.containsValue(i)) {
                list.add(i);
            }
        }

        System.out.println("Common elements: "+list);
    }
}
