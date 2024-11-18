package com.collection_api.list.vector;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {

        // 1. Creating a vector of city names
        Vector<String> vector = new Vector<>();

        // 2. Adding city names to the vector
        vector.add("Junagadh");
        vector.add("Rajkot");
        vector.add("Porbandar");
        vector.add("Una");
        vector.add("Jamnagar");

        // 3. Printing the initial vector
        System.out.println("Initial Vector: " + vector);

        // 4. Printing the vector size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // 5. Removing the third city from the vector
        vector.remove(2); // Removes "Porbandar"
        System.out.println("After removing the third city: " + vector);

        // 6. Updating the name of the first city in the vector
        vector.set(0, "Junagadh-Gir");
        System.out.println("After updating the first city: " + vector);

        // 7. Checking if a particular city (e.g., "Paris") is in the vector
        boolean containsParis = vector.contains("Paris");
        System.out.println("Is 'Paris' in the vector? " + containsParis);
    }
}
