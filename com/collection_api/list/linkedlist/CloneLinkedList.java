package com.collection_api.list.linkedlist;

import java.util.LinkedList;

public class CloneLinkedList {
    public static void main(String[] args) {
        // Original LinkedList
        LinkedList<Integer> originalList = new LinkedList<>();
        for (int i = 1; i <= 5; i++) {
            originalList.add(i);
        }

        System.out.println("Original LinkedList: " + originalList);

        // Cloning the LinkedList (Shallow copy)
        @SuppressWarnings("unchecked")
        LinkedList<Integer> clonedList = (LinkedList<Integer>) originalList.clone();

        // Verify that they are separate instances
        System.out.println("Cloned LinkedList: " + clonedList);

        // Modify original list and observe cloned list
        originalList.add(100);
        System.out.println("Original LinkedList after modification: " + originalList);
        System.out.println("Cloned LinkedList remains unchanged: " + clonedList);
    }
}
