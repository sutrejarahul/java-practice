package com.collection_api.map.hashtable;

import java.util.Hashtable;

public class PhoneDirectory {

    private static final Hashtable<String, String> phoneDirectory = new Hashtable<>();

    public static void main(String[] args) {
        // Adding initial entries to the phone directory
        add("Bruce", "9038398323");
        add("Clark", "8309484932");
        add("Diana", "9078467234");
        add("Batman", "6794394320");
        add("Superman", "8974347832");
        add("Wonder Woman", "7864398023");

        System.out.println("\nAfter Adding");
        printPhoneDirectory();

        // Updating existing entries in the phone directory
        update("Bruce", "1111111111");
        update("Clark", "2222222222");
        update("Diana", "3333333333");

        System.out.println("\nAfter Updating");
        printPhoneDirectory();

        // Removing specific entries from the phone directory
        remove("Bruce");
        remove("Clark");
        remove("Diana");

        System.out.println("\nAfter Removing");
        printPhoneDirectory();

        // Searching for a specific contact in the phone directory
        search("Batman");
        search("Green Lantern"); // Should return "Person not found"
    }

    public static void printPhoneDirectory() {
        System.out.println("Phone Directory:");
        phoneDirectory.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    public static void add(String name, String phoneNumber) {
        phoneDirectory.put(name, phoneNumber);
    }

    public static void update(String name, String newPhoneNumber) {
        if (phoneDirectory.containsKey(name)) {
            phoneDirectory.replace(name, newPhoneNumber);
        } else {
            System.out.println("Contact " + name + " not found for update.");
        }
    }

    public static void remove(String name) {
        if (phoneDirectory.containsKey(name)) {
            phoneDirectory.remove(name);
        } else {
            System.out.println("Contact " + name + " not found for removal.");
        }
    }

    public static void search(String name) {
        System.out.println("\n" + name + " : " + phoneDirectory.getOrDefault(name, "Person not found"));
    }
}

