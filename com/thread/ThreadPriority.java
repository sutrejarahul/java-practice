package com.thread;

class A1 extends Thread {

    public void run() {
        for (int i=0; i<=10; i++) {
            System.out.println("hi");
        }
    }
}

class B1 extends Thread {

    public void run() {
        for (int i=0; i<=10; i++) {
            System.out.println("hello");
        }
    }
}

public class ThreadPriority {

    public static void main(String[] args) {
        A1 a1 = new A1();
        B1 b1 = new B1();

        System.out.println(a1.getPriority());
        System.out.println(b1.getPriority());

        a1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(a1.getPriority());
        a1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(a1.getPriority());
        a1.setPriority(Thread.NORM_PRIORITY); // default
        System.out.println(a1.getPriority());

        b1.setPriority(Thread.MAX_PRIORITY -1);
        System.out.println(b1.getPriority());

    }
}
