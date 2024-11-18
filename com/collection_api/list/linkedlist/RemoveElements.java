package com.collection_api.list.linkedlist;

import java.util.LinkedList;

public class RemoveElements {

    public static void main(String[] args) {

        // Creating a LinkedList of strings
        LinkedList<String> list = new LinkedList<>();

        list.add("Avengers");
        list.add("Iron Man");
        list.add("Transformers");
        list.add("Matrix");
        list.add("Man of Steel");

        // Printing the initial contents of the list
        System.out.println("Initial LinkedList:");
        System.out.println(list);

        // Removing a movie from the list using its name and printing the updated list.
        boolean isRemoved = list.remove("Avengers");
        if (isRemoved) {
            System.out.println("Successfully removed 'Avengers'.");
        } else {
            System.out.println("'Avengers' was not found in the list.");
        }
        System.out.println("Updated LinkedList:");
        System.out.println(list);

        // Checking if the list has enough elements before removing first and last
        if (!list.isEmpty()) {
            list.removeFirst();
            System.out.println("Removed the first element.");
        }

        if (list.size() > 1) {
            list.removeLast();
            System.out.println("Removed the last element.");
        }

        // Printing the updated contents of the list
        System.out.println("Final LinkedList:");
        System.out.println(list);
    }
}
