package com.collection_api.set.hashset;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class IntersectionOfSets {

    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            hashSet1.add(random.nextInt(100));
            hashSet2.add(random.nextInt(100));
        }

        Set<Integer> finalSet = getElementsExistInBothSets(hashSet1, hashSet2);
        System.out.println(finalSet);
    }

    public static Set<Integer> getElementsExistInBothSets(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }
}
