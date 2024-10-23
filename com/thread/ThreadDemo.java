package com.thread;

class A extends Thread {

    public void run() {
        for (int i=0; i<=10; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread {

    public void run() {
        for (int i=0; i<=10; i++) {
            System.out.println("hello");
        }
    }
}

public class ThreadDemo {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}
