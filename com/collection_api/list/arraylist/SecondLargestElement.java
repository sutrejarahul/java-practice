package com.collection_api.list.arraylist;

import java.util.ArrayList;

public class SecondLargestElement {

    public static void main(String[] args) {
        // Initialize the ArrayList with some values
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(4);
        arrayList.add(45);
        arrayList.add(99);
        arrayList.add(45);

        // Initialize firstLargest and secondLargest
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Iterate through the ArrayList
        for (int element : arrayList) {
            if (element > firstLargest) {
                // Update secondLargest before updating firstLargest
                secondLargest = firstLargest;
                firstLargest = element;
            } else if (element > secondLargest && element != firstLargest) {
                // Update secondLargest only if element is not equal to firstLargest
                secondLargest = element;
            }
        }

        // Check if we found a valid second-largest element
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (ArrayList may contain all identical elements).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}
