package com.collection_api.set.linked_hashset;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        // 1. Creating a LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // 2. add() - Adding elements to the set
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");
        linkedHashSet.add("Apple"); // Duplicate elements are ignored

        System.out.println("LinkedHashSet after adding elements: " + linkedHashSet);

        // 3. contains() - Checking if an element exists
        System.out.println("Contains 'Banana'? " + linkedHashSet.contains("Banana"));

        // 4. remove() - Removing an element
        linkedHashSet.remove("Date");
        System.out.println("LinkedHashSet after removing 'Date': " + linkedHashSet);

        // 5. isEmpty() - Checking if the set is empty
        System.out.println("Is the LinkedHashSet empty? " + linkedHashSet.isEmpty());

        // 6. size() - Getting the number of elements in the set
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // 7. iterator() - Iterating over elements
        System.out.print("Elements in LinkedHashSet: ");
        for (String element : linkedHashSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 8. clear() - Removing all elements
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clear(): " + linkedHashSet);
    }
}

