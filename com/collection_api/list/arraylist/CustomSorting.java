package com.collection_api.list.arraylist;

import java.util.ArrayList;

class Employee {
    String name;
    double salary;  // Changed to double for more practical use case
    String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

public class CustomSorting {

    public static void main(String[] args) {

        // Creating arraylist of employee object
        ArrayList<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee("Sasuki", 25000, "Q.A"));
        employeesList.add(new Employee("Kakashi", 75000, "Software Developer"));
        employeesList.add(new Employee("Naturo", 80000, "B.A."));
        employeesList.add(new Employee("Itachi", 60000, "UI/UX"));
        employeesList.add(new Employee("Yahiko", 70000, "Administrator"));

        // Custom sorting by salary in descending order using Lambda expression
        employeesList.sort((e1, e2) -> Double.compare(e2.salary, e1.salary));

        // Printing the sorted list
        for (Employee e : employeesList) {
            System.out.println(e);
        }
    }
}
