package com.collection_api.map.hashtable;

import java.util.Hashtable;

public class LibraryBookManagement {

    private static final Hashtable<String, Integer> bookLibrary = new Hashtable<>();

    public static void main(String[] args) {

        // Adding initial entries to the book library
        add("Book 1", 1);
        add("Book 2", 3);
        add("Book 3", 5);
        add("Book 4", 7);
        add("Book 5", 9);

        System.out.println("\nAfter Adding");
        printBookLibrary();

        // Updating quantities in the book library
        updateQuantity("Book 2", 2); // Add 2 more of "Book 2"
        updateQuantity("Book 4", -3); // Remove 3 of "Book 4"
        updateQuantity("Book 6", 4); // Attempt to update a non-existing book

        System.out.println("\nAfter Updating");
        printBookLibrary();

        // Searching for a specific book in the library
        search("Book 5");
        search("Book 6"); // Should return 0 as it's not in the library

        // Removing a book from the library
        remove("Book 1");
        System.out.println("\nAfter Removing Book 1");
        printBookLibrary();
    }

    public static void printBookLibrary() {
        System.out.println("Book Library:");
        bookLibrary.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    public static void add(String name, int quantity) {
        if (quantity < 0) {
            System.out.println("Quantity cannot be negative.");
            return;
        }
        bookLibrary.put(name, quantity);
    }

    public static void updateQuantity(String name, int quantityChange) {
        if (!bookLibrary.containsKey(name)) {
            System.out.println("Book " + name + " not found for update.");
            return;
        }

        int updatedQuantity = bookLibrary.get(name) + quantityChange;
        if (updatedQuantity < 0) {
            System.out.println("Cannot reduce quantity below 0 for " + name);
            return;
        }

        bookLibrary.put(name, updatedQuantity);
    }

    public static void search(String name) {
        System.out.println("\n" + name + " : " + bookLibrary.getOrDefault(name, 0));
    }

    public static void remove(String name) {
        if (bookLibrary.remove(name) != null) {
            System.out.println(name + " has been removed from the library.");
        } else {
            System.out.println(name + " was not found in the library.");
        }
    }
}

