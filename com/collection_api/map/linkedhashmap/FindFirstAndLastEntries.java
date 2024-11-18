package com.collection_api.map.linkedhashmap;


import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstAndLastEntries {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("i-phone X", 34999);
        linkedHashMap.put("samsung s23", 69089);
        linkedHashMap.put("nothing 2a", 27890);
        linkedHashMap.put("vivo x23", 44999);
        linkedHashMap.put("realme gt3", 16799);

        getFirstEntry(linkedHashMap);
        getLastEntry(linkedHashMap);
    }

    public static void getFirstEntry(LinkedHashMap<String, Integer> map) {
        if (!map.isEmpty()) {
            Map.Entry<String, Integer> firstEntry = map.entrySet().iterator().next();
            System.out.println("First Entry: " + firstEntry.getKey() + " -> " + firstEntry.getValue());
        } else {
            System.out.println("The map is empty.");
        }
    }

    public static void getLastEntry(LinkedHashMap<String, Integer> map) {
        if (!map.isEmpty()) {
            Map.Entry<String, Integer> lastEntry = null;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                lastEntry = entry;
            }
            System.out.println("Last Entry: " + lastEntry.getKey() + " -> " + lastEntry.getValue());
        } else {
            System.out.println("The map is empty.");
        }
    }
}


