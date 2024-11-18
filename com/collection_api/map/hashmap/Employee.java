package com.collection_api.map.hashmap;

import java.util.HashMap;

public class Employee {
    public static void main(String[] args) {

        HashMap<Integer, String> employeeDepartments = new HashMap<>();

        // Mapping employee IDs to departments
        employeeDepartments.put(1, "Network");
        employeeDepartments.put(2, "Administrator");
        employeeDepartments.put(3, "Quality Analysis");
        employeeDepartments.put(4, "Business Analysis");
        employeeDepartments.put(5, "Data Analysis");

        // Retrieve department by employee ID
        int idToLookup = 5;
        if (employeeDepartments.containsKey(idToLookup)) {
            String department = employeeDepartments.get(idToLookup);
            System.out.println("Department for ID " + idToLookup + ": " + department);
        } else {
            System.out.println("No department found for ID " + idToLookup);
        }

        // Print all employee IDs and their departments
        System.out.println("All Employee IDs and Departments:");
        employeeDepartments.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

