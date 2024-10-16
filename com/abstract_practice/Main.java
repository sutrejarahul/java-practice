package com.abstract_practice;

abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle {
    void startEngine() {
        System.out.println("Car engine starts");
    }

    void stopEngine() {
        System.out.println("Car engine stops");
    }
}

class Bike extends Vehicle {
    void startEngine() {
        System.out.println("Bike engine starts");
    }

    void stopEngine() {
        System.out.println("Bike engine stops");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.stopEngine();

        Bike bike = new Bike();
        bike.startEngine();
        bike.stopEngine();
    }
}