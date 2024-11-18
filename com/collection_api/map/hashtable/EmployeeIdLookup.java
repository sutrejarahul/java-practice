package com.collection_api.map.hashtable;

import java.util.Hashtable;

public class EmployeeIdLookup {

    private static final Hashtable<Integer, String> employeeTable = new Hashtable<>();

    public static void main(String[] args) {

        // Populate the hashtable with employee IDs and names
        for (int i = 1; i <= 10; i++) {
            employeeTable.put(i, "Employee " + i);
        }

        // Remove specific employee IDs
        removeEmployees(2, 4, 6, 8, 10);

        // Lookup for an employee by ID
        searchEmployee(1);

        // Display all remaining employees
        displayEmployees();
    }

    private static void removeEmployees(int... ids) {
        for (int id : ids) {
            employeeTable.remove(id);
        }
    }

    private static void searchEmployee(int id) {
        String name = employeeTable.get(id);
        if (name != null) {
            System.out.println("Employee with ID " + id + ": " + name);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    private static void displayEmployees() {
        System.out.println("\nRemaining Employees:");
        employeeTable.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

