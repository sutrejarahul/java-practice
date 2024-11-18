package com.collection_api.list.arraylist;

import java.util.ArrayList;

// Defining a Student class with properties: name, age, and grade.
class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", grade=" + grade + "}";
    }
}

public class ArrayListOfObjects {

    public static void main(String[] args) {
        // Creating array list of Student object
        ArrayList<Student> listOfStudent = new ArrayList<>();

        listOfStudent.add(new Student("Rahul", 18, 7.8));
        listOfStudent.add(new Student("Harsh", 29, 8.0));
        listOfStudent.add(new Student("Vivek", 15, 12.5));
        listOfStudent.add(new Student("Kazushi", 30, 10.0));
        listOfStudent.add(new Student("James", 22, 5.0));

        // Finding the highest-grade student from the list
        Student highestGradeStudent = null;
        for (Student student : listOfStudent) {
            if (highestGradeStudent == null || student.grade > highestGradeStudent.grade) {
                highestGradeStudent = student;
            }
        }

        // Handling case where list might be empty
        if (highestGradeStudent != null) {
            System.out.println("Student with the highest grade: " + highestGradeStudent);
        } else {
            System.out.println("No students in the list.");
        }

        // Printing students with age greater than 20
        System.out.println("\nStudents with age greater than 20:");
        for (Student s : listOfStudent) {
            if (s.age > 20) {
                System.out.println(s);
            }
        }
    }
}
