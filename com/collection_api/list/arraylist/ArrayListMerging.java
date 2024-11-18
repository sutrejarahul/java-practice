package com.collection_api.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMerging {

    public static void main(String[] args) {

        // 1. Creating first ArrayList of integers
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);

        // 2. Creating second ArrayList of integers
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        // 3. Merging the two lists into a third ArrayList
        ArrayList<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        // 4. Sorting the merged list in ascending order
        Collections.sort(mergedList);

        // Printing the results
        System.out.println("First list: " + list1);
        System.out.println("Second list: " + list2);
        System.out.println("Merged list in ascending order: " + mergedList);
    }
}
