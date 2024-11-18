package com.collection_api.set.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindCommonElements {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");
        list1.add("date");

        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("date");
        list2.add("fig");

        Set<String> commonElements = findCommonElements(list1, list2);
        System.out.println(commonElements);  // Expected output: [banana, date]
    }

    public static Set<String> findCommonElements(List<String> list1, List<String> list2) {
        Set<String> commonElements = new HashSet<>(list1);
        commonElements.retainAll(list2);
        return commonElements;
    }
}
