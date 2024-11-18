package com.collection_api.list.arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. Creating an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 2. Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add(1, "Grapes"); // Add element at index 1
        System.out.println("ArrayList after adding elements: " + list);

        // 3. Accessing elements
        String element = list.get(2); // Get element at index 2
        System.out.println("Element at index 2: " + element);

        // 4. Modifying elements
        list.set(2, "Pineapple"); // Set new value at index 2
        System.out.println("ArrayList after modification: " + list);

        // 5. Removing elements
        list.remove(1); // Remove element at index 1
        list.remove("Orange"); // Remove element by value
        System.out.println("ArrayList after removing elements: " + list);

        // 6. Checking if an element exists
        boolean containsApple = list.contains("Apple");
        System.out.println("Does list contain 'Apple'? " + containsApple);

        // 7. Getting the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);

        // 8. Checking if the list is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);

        // 9. Iterating over the ArrayList
        System.out.println("Iterating over the ArrayList:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 10. Clearing all elements
        list.clear();
        System.out.println("ArrayList after clear(): " + list);

        // 11. Adding elements again and converting ArrayList to an array
        list.add("Mango");
        list.add("Peach");
        Object[] array = list.toArray();
        System.out.println("ArrayList converted to array: ");
        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}
