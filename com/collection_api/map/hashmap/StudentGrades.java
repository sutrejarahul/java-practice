package com.collection_api.map.hashmap;

import java.util.HashMap;

public class StudentGrades {

    public static void main(String[] args) {
        // Initialize HashMap for storing student names and grades
        HashMap<String, Double> hashMap = new HashMap<>();

        // Adding initial student grades
        hashMap.put("Gojo", 9.5);
        hashMap.put("Geto", 7.7);
        hashMap.put("Yuzi", 6.2);

        // Updating some student grades
        hashMap.replace("Gojo", 5.5);
        hashMap.replace("Yuzi", 9.2);

        // Display all students and their grades
        hashMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
