package com.collection_api.set.treeset;

import java.util.TreeSet;

class Student implements Comparable<Student> {
    private String name;
    private Double grade;

    public Student(String name, Double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    // Compare based on grades to enable natural ordering by grade in TreeSet
    @Override
    public int compareTo(Student student) {
        return this.grade.compareTo(student.grade);
    }
}

public class CustomObjectsInTreeSet {

    public static void main(String[] args) {
        // TreeSet with custom Student objects
        TreeSet<Student> treeSet = new TreeSet<>();

        treeSet.add(new Student("Jordan", 8.9));
        treeSet.add(new Student("Clark", 9.1));
        treeSet.add(new Student("Bruce", 10.9));
        treeSet.add(new Student("Diana", 7.6));
        treeSet.add(new Student("Arthur", 5.2));

        // Display all students sorted by grade
        System.out.println("Students sorted by grade:");
        treeSet.forEach(System.out::println);

        // Get the student with the highest grade (last element in TreeSet)
        Student maxStudent = treeSet.last();
        System.out.println("Student with the highest grade: " + maxStudent);
    }
}
