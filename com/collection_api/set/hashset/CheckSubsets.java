package com.collection_api.set.hashset;

import java.util.HashSet;

public class CheckSubsets {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            set1.add(i);
            if (i % 2 != 0) {
                set2.add(i);
            }
        }

        boolean isSubset = isSubset(set1, set2);
        System.out.println(isSubset);  // Expected output: true, since set2 contains only elements from set1
    }

    public static boolean isSubset(HashSet<Integer> set1, HashSet<Integer> set2) {
        return set1.containsAll(set2);
    }
}
