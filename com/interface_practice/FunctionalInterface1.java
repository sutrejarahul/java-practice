package com.interface_practice;

@FunctionalInterface
interface A {
    void show();
}

public class FunctionalInterface1 {
    public static void main(String[] args) {
        B a = new B() {
            @Override
            public void show() {
                System.out.println("in show");
            }
        };

        a.show();
    }
}
