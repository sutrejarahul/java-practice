package com.thread;

class A3 implements Runnable {

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

class B3 implements Runnable {

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

public class RunnableDemo {

    public static void main(String[] args) {
        Runnable runnable1 = new A3();
        Runnable runnable2 = new B3();

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();
    }
}
