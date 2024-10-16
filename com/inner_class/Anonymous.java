package com.inner_class;

class Test {

    public void show() {
        System.out.println("in show..");
    }
}

abstract class Person {
    abstract void printName(String name);
    abstract void printAge(int age);
}

public class Anonymous {

    public static void main(String[] args) {
        Test test = new Test() {
            public void show() {
                System.out.println("override show using Anonymous class ");
            }
        };
        test.show();

        // Abstract Anonymous class
        Person p = new Person() {
            void printName(String name) {
                System.out.println("Person Abstract class printName method implementation using anonymous class name is: "+ name);
            }

            void printAge(int age) {
                System.out.println("Person Abstract class printAge method implementation using anonymous class age is: "+ age);
            }
        };
        p.printName("Jack");
        p.printAge(30);
    }
}
