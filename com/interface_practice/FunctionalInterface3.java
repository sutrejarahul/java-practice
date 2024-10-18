package com.interface_practice;

@FunctionalInterface
interface C {
    void printName(String name);
}

public class FunctionalInterface3 {

    public static void main(String[] args) {
        C c = name -> System.out.println("My name is "+ name);
        c.printName("Caption Jack Sparrow");
    }
}
