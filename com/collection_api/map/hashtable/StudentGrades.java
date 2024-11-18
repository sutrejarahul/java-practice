package com.collection_api.map.hashtable;

import java.util.Hashtable;

public class StudentGrades {

    public static void main(String[] args) {
        Hashtable<String, Double> hashtable = new Hashtable<>();

        // Adding students and their grades
        addGrade(hashtable, "Student 1", 4.5);
        addGrade(hashtable, "Student 2", 2.2);
        addGrade(hashtable, "Student 3", 8.9);
        addGrade(hashtable, "Student 4", 7.7);
        addGrade(hashtable, "Student 5", 3.5);
        addGrade(hashtable, "Student 6", 10.5);

        System.out.println("Initial Hashtable:");
        hashtable.forEach((key, value) -> System.out.println(key + " : " + value));

        // Updating a student's grade
        addGrade(hashtable, "Student 5", 9.0);
        System.out.println("\nUpdated Hashtable (Student 5's grade changed):");
        hashtable.forEach((key, value) -> System.out.println(key + " : " + value));

        // Removing a student
        hashtable.remove("Student 6");
        System.out.println("\nUpdated Hashtable (Student 6 removed):");
        hashtable.forEach((key, value) -> System.out.println(key + " : " + value));

        // Retrieving a specific student's grade
        String student = "Student 3";
        Double studentGrade = hashtable.get(student);
        if (studentGrade != null) {
            System.out.println("\n" + student + " grade: " + studentGrade);
        } else {
            System.out.println("\n" + student + " is not found in the Hashtable.");
        }
    }

    // Helper method to add or update grades with validation
    public static void addGrade(Hashtable<String, Double> hashtable, String student, double grade) {
        if (grade >= 0 && grade <= 10) {
            hashtable.put(student, grade);
        } else {
            System.out.println("Invalid grade for " + student + ". Please enter a grade between 0 and 10.");
        }
    }
}

