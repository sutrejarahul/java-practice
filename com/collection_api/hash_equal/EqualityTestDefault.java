package com.collection_api.hash_equal;

import java.util.HashSet;

public class EqualityTestDefault {
    public static void main(String[] args) {
        // Two separate objects with the same data, living at different addresses.
        Person p1 = new Person("Alex", 30);
        Person p2 = new Person("Alex", 30);

        System.out.println("--- 1. Testing Default equals() ---");
        // QUESTION: Does p1 equal p2?
        boolean result = p1.equals(p2);
        System.out.println("p1.equals(p2): " + result); 
        // OUTPUT: false (because addresses are different)
        
        System.out.println("\n--- 2. Testing Default hashCode() ---");
        // QUESTION: Do they have the same hash code (zip code/bin number)?
        int hash1 = p1.hashCode();
        int hash2 = p2.hashCode();
        System.out.println("p1 HashCode: " + hash1); 
        System.out.println("p2 HashCode: " + hash2);
        // OUTPUT: Two DIFFERENT, random-looking numbers (because they're based on memory address)

        System.out.println("\n--- 3. Testing with HashSet (The Failure) ---");
        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        
        // The set checks p2's hash code, goes to the wrong bin, and doesn't find p1.
        System.out.println("Set contains p2: " + set.contains(p2)); 
        // OUTPUT: false (The set incorrectly says p2 is not there)
        
        set.add(p2); // Adds the "duplicate" because it thinks it's unique
        System.out.println("Set size: " + set.size());
        // OUTPUT: 2 (The set failed to block the duplicate!)
    }
}
