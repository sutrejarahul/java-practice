package com.collection_api.set.treeset;

import java.util.TreeSet;

public class WorkingWithSubsets {

    public static void main(String[] args) {
        // Initialize TreeSet with integers 1 through 20
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 1; i <= 20; i++) {
            treeSet.add(i);
        }

        // Print elements in the subset from 5 (inclusive) to 15 (exclusive)
        System.out.println("Subset from 5 (inclusive) to 15 (exclusive):");
        treeSet.subSet(5, 15).forEach(System.out::println);

        // Print all elements less than 5
        System.out.println("Elements less than 5:");
        System.out.println(treeSet.headSet(5));

        // Print all elements greater than or equal to 15
        System.out.println("Elements 15 and greater:");
        System.out.println(treeSet.tailSet(15));
    }
}
