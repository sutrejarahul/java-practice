package com.thread;

class A2 extends Thread {

    public void run() {
        for (int i=0; i<=100; i++) {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B2 extends Thread {

    public void run() {
        for (int i=0; i<=100; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadSleep {

    public static void main(String[] args) {
        A2 a2 = new A2();
        B2 b2 = new B2();

        a2.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        b2.start();
    }
}
