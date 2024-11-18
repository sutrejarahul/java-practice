package com.collection_api.map.hashtable;

import java.util.Hashtable;

public class FactorialCache {

    private static final Hashtable<Integer, Long> cache = new Hashtable<>();

    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));  // Computes and stores in cache
        System.out.println("Factorial of 7: " + factorial(7));  // Computes and stores in cache
        System.out.println("Factorial of 5: " + factorial(5));  // Retrieves from cache
        System.out.println("Factorial of 7: " + factorial(7));  // Retrieves from cache
        System.out.println("Factorial of 10: " + factorial(10)); // Computes and stores in cache
    }

    public static long factorial(int n) {
        // Check if result is already in cache
        if (cache.containsKey(n)) {
            System.out.println("Retrieving from cache for " + n);
            return cache.get(n);
        }

        // Compute factorial if not cached
        long result = calculateFactorial(n);
        cache.put(n, result);  // Store result in cache
        return result;
    }

    private static long calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}
