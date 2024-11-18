package com.collection_api.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        // 1. Creating an ArrayList of integers with some duplicate values
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(6);
        list.add(2);

        System.out.println("Before removing duplicates: " + list);

        // 2. Removing duplicate elements while preserving the order
        removeDuplicateElements(list);

        System.out.println("After removing duplicates: " + list);
    }

    public static void removeDuplicateElements(LinkedList<Integer> list) {
        // Use LinkedHashSet to preserve the insertion order and remove duplicates
        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);

        // Clear the original list and add the unique elements back
        list.clear();
        list.addAll(set);
    }
}
