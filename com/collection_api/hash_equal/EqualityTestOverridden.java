package com.collection_api.hash_equal;

import java.util.HashSet;

public class EqualityTestOverridden {
    public static void main(String[] args) {
        // Two separate objects with the same data.
        Person p1 = new Person("Alex", 30);
        Person p2 = new Person("Alex", 30);

        System.out.println("--- 1. Testing Overridden equals() ---");
        // QUESTION: Does p1 equal p2?
        boolean result = p1.equals(p2);
        System.out.println("p1.equals(p2): " + result); 
        // OUTPUT: true (because the values (name and age) are the same)
        
        System.out.println("\n--- 2. Testing Overridden hashCode() ---");
        // QUESTION: Do they have the same hash code (zip code/bin number)?
        int hash1 = p1.hashCode();
        int hash2 = p2.hashCode();
        System.out.println("p1 HashCode: " + hash1); 
        System.out.println("p2 HashCode: " + hash2);
        // OUTPUT: Two IDENTICAL numbers (e.g., 2084227) (because they are based on the same values)

        System.out.println("\n--- 3. Testing with HashSet (The Success) ---");
        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        
        // The set correctly uses the identical hash code, finds p1, and confirms p2 is a duplicate.
        System.out.println("Set contains p2: " + set.contains(p2)); 
        // OUTPUT: true (The set correctly finds the duplicate)
        
        set.add(p2); // Fails to add the duplicate
        System.out.println("Set size: " + set.size());
        // OUTPUT: 1 (The set successfully blocked the duplicate!)
    }
}
