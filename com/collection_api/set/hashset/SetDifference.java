package com.collection_api.set.hashset;

import java.util.HashSet;

public class SetDifference {

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");
        set1.add("date");

        HashSet<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("date");
        set2.add("fig");

        HashSet<String> differenceSet = difference(set1, set2);
        System.out.println(differenceSet);  // Output: [apple, cherry]
    }

    public static HashSet<String> difference(HashSet<String> set1, HashSet<String> set2) {
        HashSet<String> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);
        return differenceSet;
    }
}
