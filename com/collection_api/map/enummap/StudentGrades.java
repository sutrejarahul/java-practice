package com.collection_api.map.enummap;

import java.util.EnumMap;

enum Subject {
    MATH, SCIENCE, ENGLISH, HISTORY, ART;
}

public class StudentGrades {

    public static void main(String[] args) {

        // Create an EnumMap to store subject grades
        EnumMap<Subject, String> subjectGrades = new EnumMap<>(Subject.class);

        // Add grades for each subject
        subjectGrades.put(Subject.MATH, "A");
        subjectGrades.put(Subject.SCIENCE, "A");
        subjectGrades.put(Subject.ENGLISH, "B+");
        subjectGrades.put(Subject.HISTORY, "A");
        subjectGrades.put(Subject.ART, "B+");

        // Display all grades
        System.out.println("Student Grades:");
        subjectGrades.forEach((subject, grade) -> System.out.println(subject + ": " + grade));

        // Filter and display subjects with grade 'A'
        System.out.println("\nSubjects with Grade 'A':");
        subjectGrades.entrySet().stream()
                .filter(entry -> "A".equals(entry.getValue()))
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        // Count the number of subjects with grades 'B+'
        long countBPlus = subjectGrades.entrySet().stream()
                .filter(entry -> "B+".equals(entry.getValue()))
                .count();
        System.out.println("\nNumber of subjects with Grade 'B+': " + countBPlus);

        // Check if a specific subject (e.g., SCIENCE) has a grade 'A'
        boolean isScienceGradeA = "A".equals(subjectGrades.get(Subject.SCIENCE));
        System.out.println("\nDoes SCIENCE have Grade 'A'? " + isScienceGradeA);
    }
}

