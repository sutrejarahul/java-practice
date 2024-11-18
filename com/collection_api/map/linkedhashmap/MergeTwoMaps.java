package com.collection_api.map.linkedhashmap;

import java.util.LinkedHashMap;

record Student(float grade, String course) {

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", course='" + course + '\'' +
                '}';
    }
}

public class MergeTwoMaps {

    public static void main(String[] args) {

        LinkedHashMap<String, Student> linkedHashMapOne = new LinkedHashMap<>();
        LinkedHashMap<String, Student> linkedHashMapTwo = new LinkedHashMap<>();

        linkedHashMapOne.put("Clark", new Student(8.9F, "Information Technology"));
        linkedHashMapOne.put("Bruce", new Student(7.9F, "AWS"));
        linkedHashMapOne.put("Diana", new Student(6.5F, "Data Science"));

        linkedHashMapTwo.put("Superman", new Student(8.9F, "UI/UX"));
        linkedHashMapTwo.put("Batman", new Student(7.9F, "Artificial Intelligence"));
        linkedHashMapTwo.put("Wonder Woman", new Student(6.5F, "Quality Analysis"));

        // Merge the maps, allowing linkedHashMapTwo to overwrite any duplicates from linkedHashMapOne
        LinkedHashMap<String, Student> mergedMap = new LinkedHashMap<>(linkedHashMapOne);
        mergedMap.putAll(linkedHashMapTwo);

        // Display the merged map
        System.out.println("Merged Map:");
        mergedMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}

