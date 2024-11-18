package com.collection_api.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class BasicOperation {

    public static void main(String[] args) {

        // 1. Creating an ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        // 2. Adding elements
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);

        // 3. Print the sum of all elements in the list
        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.println("Sum of all elements in the list: " + sum);

        // 4. Remove the first element and print the updated list
        if (!list.isEmpty()) {
            list.remove(0);
            System.out.println("Updated list after removing the first element: " + list);
        } else {
            System.out.println("List is empty, no element to remove.");
        }

        // 5. Find and print the maximum and minimum elements in the list
        if (!list.isEmpty()) {
            int min = Collections.min(list);
            int max = Collections.max(list);

            System.out.println("Maximum element in the list: " + max);
            System.out.println("Minimum element in the list: " + min);
        } else {
            System.out.println("List is empty, cannot find maximum and minimum elements.");
        }
    }
}
