package com.collection_api.set.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class SortingWithTreeSet {

    public static void main(String[] args) {

        // Initialize TreeSet with a comparator for descending order
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());

        // Add elements to the TreeSet
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(0);
        treeSet.add(-1);
        treeSet.add(-2);
        treeSet.add(-3);
        treeSet.add(-4);
        treeSet.add(-5);

        // Print elements in descending order
        System.out.println("TreeSet in descending order: " + treeSet);

        // Print a subset of elements from -3 (inclusive) to 4 (exclusive) in descending order
        System.out.println("Subset from -3 to 4 in descending order:");
        treeSet.subSet(4, -3).forEach(System.out::println);

    }
}
