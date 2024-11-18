package com.collection_api.list.arraylist;

import java.util.ArrayList;

public class ReverseArrayList {

    public static void main(String[] args) {

        // 1. Creating an ArrayList of 10 integer values
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(11);
        list.add(3);
        list.add(13);
        list.add(5);
        list.add(15);
        list.add(7);
        list.add(17);
        list.add(9);
        list.add(19);

        // 2. Print the original list
        System.out.println("Original List:");
        printList(list);

        // 3. Reverse the list manually (without using Collections.reverse)
        reverseTheList(list);

        // 4. Print the reversed list
        System.out.println("Reversed List:");
        printList(list);
    }

    // Function to reverse the list without using Collections.reverse()
    public static void reverseTheList(ArrayList<Integer> list) {
        int start = 0;
        int end = list.size() - 1;
        while (start < end) {
            // Swap the elements
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }

    // Function to print the list
    public static void printList(ArrayList<Integer> list) {
        for (Integer num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
