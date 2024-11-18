package com.collection_api.map.treemap;

import java.util.TreeMap;

record Person(String name, int age) implements Comparable<Person> {

    @Override
    public int compareTo(Person person) {
        int ageComparison = Integer.compare(this.age, person.age);
        return (ageComparison != 0) ? ageComparison : this.name.compareTo(person.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class CustomObjects {

    public static void main(String[] args) {
        TreeMap<Person, String> treeMap = new TreeMap<>();

        treeMap.put(new Person("Jolly", 23), "8932289432");
        treeMap.put(new Person("James", 13), "9084932939");
        treeMap.put(new Person("Jack", 55), "7833290493");
        treeMap.put(new Person("Jacob", 20), "6890338392");
        treeMap.put(new Person("Jorden", 60), "9037384321");
        treeMap.put(new Person("John", 23), "9988776655"); // Added person with same age as "Jolly"

        treeMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

