package com.collection_api.set.treeset;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class FindNearestElements {

    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();

        // Adding 20 random integers (0-99) to the TreeSet
        for (int i = 1; i <= 20; i++) {
            treeSet.add(random.nextInt(100));
        }

        System.out.println("Generated TreeSet: " + treeSet);
        System.out.println();

        findsClosestLowerAndHigherValues(treeSet);
    }

    public static void findsClosestLowerAndHigherValues(TreeSet<Integer> treeSet) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find the closest lower and higher values: ");
        int userInput = scanner.nextInt();

        Integer lowerValue = treeSet.floor(userInput);
        Integer higherValue = treeSet.ceiling(userInput);

        // Display results with null checks
        System.out.println("Closest Lower Value: " + (lowerValue != null ? lowerValue : "No lower value available"));
        System.out.println("Closest Higher Value: " + (higherValue != null ? higherValue : "No higher value available"));

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
