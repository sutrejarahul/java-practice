package com.collection_api.set.hashset;

import java.util.HashSet;

public class CompareTwoSets {

    public static void main(String[] args) {
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                hashSet1.add(i);  // Adds odd numbers
                hashSet2.add(i);  // Adds odd numbers
            }
        }

        boolean areSetsEqual = hashSet1.equals(hashSet2);
        System.out.println("Are both sets equal? " + areSetsEqual);
    }
}
