package com.collection_api.list.arraylist;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        // 1. Creating an ArrayList of integers with some duplicate values
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(6);
        list.add(2);

        System.out.println("Before removing duplicates: " + list);

        // 2. Call the method to get the list with unique elements
        ArrayList<Integer> uniqueList = getUniqueElements(list);

        System.out.println("After removing duplicates: " + uniqueList);
    }

    // Method to get a new list with unique elements
    public static ArrayList<Integer> getUniqueElements(ArrayList<Integer> list) {
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer i : list) {
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }
        return uniqueList;
    }
}
