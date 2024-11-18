package com.collection_api.list.vector;

import java.util.ArrayList;
import java.util.Vector;

public class ReverseVector {

    public static void main(String[] args) {

        // 1. Creating Vector of 10 integer values
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(11);
        vector.add(3);
        vector.add(13);
        vector.add(5);
        vector.add(15);
        vector.add(7);
        vector.add(17);
        vector.add(9);
        vector.add(19);

        // 2. Print the original Vector
        System.out.println("Original Vector:");
        printVector(vector);

        // 3. Reverse the Vector manually (without using Collections.reverse)
        reverseTheVector(vector);

        // 4. Print the reversed Vector
        System.out.println("Reversed Vector:");
        printVector(vector);
    }

    // Function to reverse the Vector without using Collections.reverse()
    public static void reverseTheVector(Vector<Integer> vector) {
        int start = 0;
        int end = vector.size() - 1;
        while (start < end) {
            // Swap the elements
            int temp = vector.get(start);
            vector.set(start, vector.get(end));
            vector.set(end, temp);
            start++;
            end--;
        }
    }

    // Function to print the Vector
    public static void printVector(Vector<Integer> vector) {
        for (Integer num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
