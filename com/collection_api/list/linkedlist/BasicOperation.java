package com.collection_api.list.linkedlist;

import java.util.LinkedList;
import java.util.Iterator;

public class BasicOperation {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add(1, "D"); // Inserts D at index 1
        linkedList.addFirst("E"); // Adds E at the beginning
        linkedList.addLast("F"); // Adds F at the end

        // Retrieving elements
        System.out.println("Element at index 2: " + linkedList.get(2));
        System.out.println("First Element: " + linkedList.getFirst());
        System.out.println("Last Element: " + linkedList.getLast());

        // Removing elements
        linkedList.remove(1); // Removes D
        linkedList.remove("C"); // Removes C
        System.out.println("Removed First Element: " + linkedList.removeFirst());
        System.out.println("Removed Last Element: " + linkedList.removeLast());

        // Checking elements
        System.out.println("Contains B: " + linkedList.contains("B"));
        System.out.println("Size of the list: " + linkedList.size());

        // Iterating through the LinkedList
        System.out.println("Elements in the LinkedList:");
        for (String s : linkedList) {
            System.out.println(s);
        }

        // Iterating through the LinkedList using Iterator
        System.out.println("Elements in the LinkedList:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Clear and check if empty
        linkedList.clear();
        System.out.println("Is the LinkedList empty? " + linkedList.isEmpty());
    }
}

