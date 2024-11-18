package com.collection_api.list.linkedlist;

import java.util.LinkedList;

public class MergeSortLinkedList {

    // Merge Sort for LinkedList
    public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
        if (list.size() <= 1) {
            return list;
        }

        // Split the list into two halves
        LinkedList<Integer> left = new LinkedList<>();
        LinkedList<Integer> right = new LinkedList<>();

        int mid = list.size() / 2;

        for (int i = 0; i < mid; i++) {
            left.add(list.get(i));
        }
        for (int i = mid; i < list.size(); i++) {
            right.add(list.get(i));
        }

        // Recursively sort the two halves
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    // Merge two sorted lists
    public static LinkedList<Integer> merge(LinkedList<Integer> left, LinkedList<Integer> right) {
        LinkedList<Integer> result = new LinkedList<>();

        while (!left.isEmpty() && !right.isEmpty()) {
            if (left.getFirst() <= right.getFirst()) {
                result.add(left.removeFirst());
            } else {
                result.add(right.removeFirst());
            }
        }

        // Add remaining elements from left or right
        result.addAll(left);
        result.addAll(right);

        return result;
    }

    public static void main(String[] args) {
        // Create an unsorted LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        list.add(50);
        list.add(20);
        list.add(40);
        list.add(10);
        list.add(30);

        System.out.println("Unsorted List: " + list);

        // Sort the LinkedList using merge sort
        list = mergeSort(list);

        System.out.println("Sorted List: " + list);
    }
}
