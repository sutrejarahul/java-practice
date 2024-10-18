package com.interface_practice;

@FunctionalInterface
interface B {
    void show();
}

public class FunctionalInterface2 {

    public static void main(String[] args) {
        B b = () -> System.out.println("in show using lambda expression");
        b.show();
    }
}
