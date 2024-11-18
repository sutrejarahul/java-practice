package com.collection_api.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListOfStrings {

    public static void main(String[] args) {

        // 1. Creating an ArrayList of Strings
        ArrayList<String> list = new ArrayList<>();

        // 2. Adding elements
        list.add("Mango");
        list.add("Cherry");
        list.add("Banana");
        list.add("Water Melon");
        list.add("Orange");

        // 3. Check if "Mango" is in the list.
        System.out.println("Check if \"Mango\" is in the list: " + list.contains("Mango"));

        // 4. Replace the third fruit with "Kiwi"
        list.set(2, "Kiwi");
        System.out.println("After replacing the third fruit with \"Kiwi\", updated list: " + list);

        // 5. Remove any string that starts with the letter "A".
        Iterator<String> iterator = list.iterator(); // Using iterator to avoid ConcurrentModificationException
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.charAt(0) == 'A') {  // Direct character comparison
                iterator.remove();
            }
        }
        System.out.println("After removing any string that starts with the letter \"A\", updated list: " + list);

        // 6. Sort the list alphabetically and print it.
        Collections.sort(list);
        System.out.println("Alphabetically sorted list: " + list);
    }
}
