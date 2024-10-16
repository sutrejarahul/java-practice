package com.interface_practice;

interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("code, compile, run.. ");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run.. faster ");
    }
}

class Developer {

    public void devApp(Computer computer){
        computer.code();
    }
}

public class Demo {
    public static void main(String[] args) {

        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        Developer developer = new Developer();
        developer.devApp(laptop);
    }
}
