package com.collection_api.set.treeset;

import java.util.Random;
import java.util.TreeSet;

public class FindingRangeOfNumbers {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();

        // Adding 20 random integers (0-99) to the TreeSet
        for (int i = 1; i <= 20; i++) {
            treeSet.add(random.nextInt(100));
        }

        System.out.println("Complete TreeSet: " + treeSet);

        // Finding numbers in the range 30 (inclusive) to 70 (exclusive)
        TreeSet<Integer> rangeSubset = new TreeSet<>(treeSet.subSet(30, 70));
        System.out.println("\nNumbers between 30 (inclusive) and 70 (exclusive):");
        if (!rangeSubset.isEmpty()) {
            System.out.println(rangeSubset);
        } else {
            System.out.println("No elements found in this range.");
        }

        System.out.println();

        // Finding numbers less than 50
        TreeSet<Integer> headSetSubset = new TreeSet<>(treeSet.headSet(50));
        System.out.println("Numbers less than 50:");
        if (!headSetSubset.isEmpty()) {
            System.out.println(headSetSubset);
        } else {
            System.out.println("No elements found below 50.");
        }

        System.out.println();

        // Finding numbers greater than or equal to 50
        TreeSet<Integer> tailSetSubset = new TreeSet<>(treeSet.tailSet(50));
        System.out.println("Numbers 50 and above:");
        if (!tailSetSubset.isEmpty()) {
            System.out.println(tailSetSubset);
        } else {
            System.out.println("No elements found at or above 50.");
        }
    }
}
