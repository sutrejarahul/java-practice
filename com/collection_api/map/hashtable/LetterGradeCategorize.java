package com.collection_api.map.hashtable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;

public class LetterGradeCategorize {

    public static void main(String[] args) {
        List<Integer> studentsScore = new ArrayList<>();
        Random random = new Random();

        // Generating random scores
        for (int i = 1; i <= 10; i++) {
            studentsScore.add(random.nextInt(101)); // Scores from 0 to 100
        }

        System.out.println("Student Scores: " + studentsScore);

        // Categorizing scores into grades
        Hashtable<Character, Long> hashtable = new Hashtable<>();
        studentsScore.forEach(score -> {
            char grade = getGrade(score);
            hashtable.put(grade, hashtable.getOrDefault(grade, 0L) + 1);
        });

        // Displaying grade distribution
        System.out.println("\nGrade Distribution:");
        hashtable.entrySet().stream()
                .sorted((entry1, entry2) -> Character.compare(entry1.getKey(), entry2.getKey()))
                .forEach(entry -> System.out.println(entry.getKey() + " grade of total student are " + entry.getValue()));
    }

    // Helper method to determine grade based on score
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }
}

