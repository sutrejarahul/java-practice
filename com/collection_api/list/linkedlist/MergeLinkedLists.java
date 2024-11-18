package com.collection_api.list.linkedlist;

import java.util.LinkedList;

public class MergeLinkedLists {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(9);
        list1.add(7);
        list1.add(5);
        list1.add(3);
        list1.add(1);

        list1.sort(Integer::compareTo);  // Sorting list1 in ascending order
        System.out.println("List 1 after sorted: " + list1);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(8);
        list2.add(6);
        list2.add(4);
        list2.add(2);

        list2.sort(Integer::compareTo);  // Sorting list2 in ascending order
        System.out.println("List 2 after sorted: " + list2);

        LinkedList<Integer> finalList = mergeSortedLists(list1, list2);

        System.out.println("Final Merged List: " + finalList);
    }

    // Method to merge two sorted lists into one sorted list
    public static LinkedList<Integer> mergeSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();

        int i = 0, j = 0;
        // Merge both lists
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        // Add remaining elements from list1, if any
        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        // Add remaining elements from list2, if any
        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}
