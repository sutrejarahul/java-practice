package com.collection_api.list.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Adding the first 10 positive integers to the list
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Printing the list before reversal
        System.out.println("List before reversed:");
        System.out.println(list);

        // Reversing the list using a method
        reverseList(list);

        // Printing the list after reversal
        System.out.println("List after reversed:");
        System.out.println(list);
    }

    // Method to reverse the LinkedList
    private static void reverseList(LinkedList<Integer> list) {
        Collections.reverse(list); // Using Collections to reverse in place
    }

    // Method to manually reverse the LinkedList
    private static LinkedList<Integer> reverseManually(LinkedList<Integer> list) {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
