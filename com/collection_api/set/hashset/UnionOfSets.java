package com.collection_api.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class UnionOfSets {

    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                hashSet1.add(i);  // Adds odd numbers
            } else {
                hashSet2.add(i);  // Adds even numbers
            }
        }

        Set<Integer> unionSet = getUnion(hashSet1, hashSet2);
        System.out.println(unionSet);
    }

    public static Set<Integer> getUnion(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }
}
