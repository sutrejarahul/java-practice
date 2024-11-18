package com.collection_api.set.linked_hashset;

import java.util.LinkedHashSet;

public class IntersectionOfTwoSets {

    public static void main(String[] args) {
        // First LinkedHashSet with some cities
        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        set1.add("London");
        set1.add("Paris");
        set1.add("Tokyo");
        set1.add("New York");
        set1.add("Dubai");

        // Second LinkedHashSet with some overlapping cities
        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("Singapore");
        set2.add("Tokyo");
        set2.add("Barcelona");
        set2.add("London");
        set2.add("Hong Kong");

        // Perform intersection: retain only common elements between set1 and set2
        LinkedHashSet<String> intersectionSet = new LinkedHashSet<>(set1);
        intersectionSet.retainAll(set2);

        // Print the original sets and the intersection result
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersection of Set 1 and Set 2: " + intersectionSet);
    }
}
