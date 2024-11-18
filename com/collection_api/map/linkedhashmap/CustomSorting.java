package com.collection_api.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomSorting {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> employeeSalaries = new LinkedHashMap<>();
        employeeSalaries.put("Employee 1", 50000);
        employeeSalaries.put("Employee 2", 60000);
        employeeSalaries.put("Employee 3", 45000);
        employeeSalaries.put("Employee 4", 70000);
        employeeSalaries.put("Employee 5", 55000);
        employeeSalaries.put("Employee 6", 65000);

        LinkedHashMap<String, Integer> sortedSalaries = sortByValueDescending(employeeSalaries);

        // Display the sorted map
        System.out.println("Employees sorted by salary in descending order:");
        sortedSalaries.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    // Method to sort a LinkedHashMap by values in descending order
    public static LinkedHashMap<String, Integer> sortByValueDescending(LinkedHashMap<String, Integer> map) {
        return map.entrySet()
                .stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1, e2) -> e1,LinkedHashMap::new));
    }
}

