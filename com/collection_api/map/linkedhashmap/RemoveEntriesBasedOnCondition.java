package com.collection_api.map.linkedhashmap;

import java.util.LinkedHashMap;

public class RemoveEntriesBasedOnCondition {

    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        map.put(1, 78);
        map.put(2, 98);
        map.put(3, 49);
        map.put(4, 56);
        map.put(5, 44);
        map.put(6, 33);
        map.put(7, 27);

        System.out.println("Initial Students Map:");
        map.forEach((key, value) -> System.out.println("Student Id " + key + " : Obtained Marks " + value));

        // Remove students who failed (marks < 50)
        map.entrySet().removeIf(entry -> entry.getValue() < 50);

        System.out.println("\nAfter removing students with marks below 50, the updated map:");
        map.forEach((key, value) -> System.out.println("Student Id " + key + " : Obtained Marks " + value));
    }
}

