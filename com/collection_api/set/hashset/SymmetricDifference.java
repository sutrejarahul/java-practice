package com.collection_api.set.hashset;

import java.util.HashSet;
import java.util.Random;

public class SymmetricDifference {

    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        Random random = new Random();
        for (int i = 1; i <= 10; i++) {
            hashSet1.add(random.nextInt(100));
            hashSet2.add(random.nextInt(100));
        }

        System.out.println("Set 1: " + hashSet1);
        System.out.println("Set 2: " + hashSet2);

        HashSet<Integer> finalHashSet = getSymmetricDifference(hashSet1, hashSet2);
        System.out.println("Symmetric Difference: " + finalHashSet);
    }

    public static HashSet<Integer> getSymmetricDifference(HashSet<Integer> hashSet1, HashSet<Integer> hashSet2) {
        // Create a new set containing the union of both sets
        HashSet<Integer> symmetricDifference = new HashSet<>(hashSet1);
        symmetricDifference.addAll(hashSet2);

        // Create a new set containing the intersection of both sets
        HashSet<Integer> intersection = new HashSet<>(hashSet1);
        intersection.retainAll(hashSet2);

        // Remove all elements in the intersection from the union
        symmetricDifference.removeAll(intersection);

        return symmetricDifference;
    }
}
