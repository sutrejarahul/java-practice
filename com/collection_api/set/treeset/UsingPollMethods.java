package com.collection_api.set.treeset;

import java.util.TreeSet;

public class UsingPollMethods {

    public static void main(String[] args) {
        // Initialize TreeSet with Double values
        TreeSet<Double> treeSet = new TreeSet<>();
        treeSet.add(25.67);
        treeSet.add(15.5);
        treeSet.add(2.8);
        treeSet.add(0.6);
        treeSet.add(13.48);

        // Print initial TreeSet
        System.out.println("Initial TreeSet: " + treeSet);

        // Poll and print the first (smallest) element
        Double first = treeSet.pollFirst();
        if (first != null) {
            System.out.println("First (smallest) element removed: " + first);
        } else {
            System.out.println("TreeSet is empty; no first element to remove.");
        }
        System.out.println("TreeSet after removing first element: " + treeSet);

        // Poll and print the last (largest) element
        Double last = treeSet.pollLast();
        if (last != null) {
            System.out.println("Last (largest) element removed: " + last);
        } else {
            System.out.println("TreeSet is empty; no last element to remove.");
        }
        System.out.println("TreeSet after removing last element: " + treeSet);
    }
}
