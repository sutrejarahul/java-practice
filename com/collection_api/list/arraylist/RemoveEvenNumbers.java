package com.collection_api.list.arraylist;

import java.util.ArrayList;

public class RemoveEvenNumbers {

    public static void main(String[] args) {

        // 1. Creating an ArrayList of 10 integers.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        // Printing the original list
        System.out.println("Original list: " + list);

        // 2. Removing all even numbers from the list
        list.removeIf(i -> i % 2 == 0);

        // Printing the modified list containing only odd numbers
        System.out.println("List after removing even numbers: " + list);
    }
}
