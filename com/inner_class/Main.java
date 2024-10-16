package com.inner_class;

class A {
    int age;

    public void show() {
        System.out.println("in show");
    }

    // non static inner class
//    class B {
//        public void config() {
//            System.out.println("in config");
//        }
//    }

    // static inner class
    static class B {
        public void config() {
            System.out.println("in config");
        }
    }
}

public class Main {

    public static void main(String[] args) {
        A a = new A();
        a.show();

//        A.B ab = a.new B(); // non static inner class object creation
        A.B ab = new A.B(); // static inner class object creation
        ab.config();
    }
}
