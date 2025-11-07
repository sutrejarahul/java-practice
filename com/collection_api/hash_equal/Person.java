package com.collection_api.hash_equal;


class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // NOTE: The equals() and hashCode() methods are commented out for the first test.

    // --- START: CORRECT OVERRIDE (UNCOMMENT TO TEST) ---
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
    // --- END: CORRECT OVERRIDE ---

    // Simple toString for clean output
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
