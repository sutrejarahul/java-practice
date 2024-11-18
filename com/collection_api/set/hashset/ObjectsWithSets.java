package com.collection_api.set.hashset;

import java.util.HashSet;
import java.util.Objects;

class Person {
    private final String name;
    private final Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Override equals method to check equality based on name and age
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(age, person.age);
    }

    // Override hashCode method to ensure consistent hashing for duplicate objects
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ObjectsWithSets {

    public static void main(String[] args) {
        Person p1 = new Person("James", 30);
        Person p2 = new Person("Carl", 35);
        Person p3 = new Person("Rambo", 55);
        Person p4 = new Person("Levie", 30);
        Person p5 = new Person("James", 30);  // Duplicate of p1

        HashSet<Person> personHashSet = new HashSet<>();
        personHashSet.add(p1);
        personHashSet.add(p2);
        personHashSet.add(p3);
        personHashSet.add(p4);

        // Attempting to add duplicate
        if (!personHashSet.add(p5)) {
            System.out.println("Duplicate person not added: " + p5);
        }

        // Display contents of the set
        personHashSet.forEach(System.out::println);
    }
}
