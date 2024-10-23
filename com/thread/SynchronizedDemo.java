package com.thread;

class Counter {
    int count;

    public synchronized void increment() {
        count++;
    }
}

public class SynchronizedDemo {

    public static void main(String[] args) {

        Counter counter = new Counter();

        Runnable runnable1 = () -> {
            for (int i=1; i<=10000; i++) {
                counter.increment();
            }
        };

        Runnable runnable2 = () -> {
            for (int i=1; i<=10000; i++) {
                counter.increment();
            }
        };

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(counter.count);
    }
}
