package com.collection_api.quaue.concurrent_linked_queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

public class BulkOperations {

    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Initial Queue: " + queue);

        // Task 1: Add all elements from another collection
        List<Integer> newElements = Arrays.asList(11, 12, 13);
        addAllElements(queue, newElements);
        System.out.println("Queue after adding new elements: " + queue);

        // Task 2: Remove all even numbers
        removeIf(queue, x -> x % 2 == 0);
        System.out.println("Queue after removing even numbers: " + queue);

        // Task 3: Check if queue contains all elements from another collection
        List<Integer> subset = Arrays.asList(1, 3, 5);
        boolean containsAll = containsAllElements(queue, subset);
        System.out.println("Does the queue contain " + subset + "? " + containsAll);

        // Task 4: Retain only specific elements
        List<Integer> elementsToRetain = Arrays.asList(1, 7, 13);
        retainAllElements(queue, elementsToRetain);
        System.out.println("Queue after retaining only specific elements: " + queue);
    }

    // Task 1: Add all elements from another collection
    public static <T> void addAllElements(ConcurrentLinkedQueue<T> queue, List<T> elements) {
        queue.addAll(elements);
    }

    // Task 2: Remove all elements matching a condition
    public static <T> void removeIf(ConcurrentLinkedQueue<T> queue, java.util.function.Predicate<T> condition) {
        queue.removeIf(condition);
    }

    // Task 3: Check if queue contains all elements from another collection
    public static <T> boolean containsAllElements(ConcurrentLinkedQueue<T> queue, List<T> elements) {
        return queue.containsAll(elements);
    }

    // Task 4: Retain only specific elements in the queue
    public static <T> void retainAllElements(ConcurrentLinkedQueue<T> queue, List<T> elementsToRetain) {
        queue.retainAll(elementsToRetain);
    }
}

