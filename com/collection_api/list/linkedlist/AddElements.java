package com.collection_api.list.linkedlist;

import java.util.LinkedList;

public class AddElements {

    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Adding the first 10 positive integers to the list
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Printing the initial contents of the list
        System.out.println("Initial LinkedList:");
        System.out.println(list);

        // Adding an integer at the beginning of the list.
        list.addFirst(77);
        // Adding an integer at a specified index (e.g., index 5).
        if (list.size() >= 5) {
            list.add(5, 55); // Ensure index is valid before adding
        } else {
            System.out.println("List size is less than 6, cannot add 55 at index 5.");
        }

        // Adding an integer at the end of the list.
        list.addLast(99);

        // Printing the updated contents of the list
        System.out.println("Updated LinkedList:");
        System.out.println(list);
    }
}
