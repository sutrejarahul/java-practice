package com.collection_api.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Adding the first 10 positive integers to the list
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Printing the contents of the list
        System.out.println("Contents of the LinkedList:");
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
