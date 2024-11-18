package com.collection_api.list.linkedlist;

import java.util.LinkedList;

public class FindMiddleElement {

    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to the list
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Finding the middle element(s)
        printMiddleElement(list);
    }

    public static void printMiddleElement(LinkedList<Integer> list) {
        int size = list.size();
        if (size % 2 == 1) {
            // Odd number of elements, print the single middle element
            int middleIndex = size / 2;
            System.out.println("Middle Element: " + list.get(middleIndex));
        } else {
            // Even number of elements, print the two middle elements
            int middleIndex1 = size / 2 - 1;
            int middleIndex2 = size / 2;
            System.out.println("Middle Elements: " + list.get(middleIndex1) + " and " + list.get(middleIndex2));
        }
    }
}
