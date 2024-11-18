package com.collection_api.map.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculateAverageGrades {

    public static void main(String[] args) {
        Map<String, List<Integer>> grades = new HashMap<>();
        grades.put("Alice", Arrays.asList(90, 85, 88));
        grades.put("Bob", Arrays.asList(70, 80, 78));

        grades.forEach((key, value) -> {
            System.out.println(key + " : " + calculateAverageGrade(value));
        });
    }

    public static Double calculateAverageGrade(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0.0;  // Return 0 or an appropriate default value if the list is empty
        }

        // Sum the grades using a stream (alternative to using a for loop)
        return list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }
}

