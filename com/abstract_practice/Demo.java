package com.abstract_practice;
abstract class Vehicle2 {
    // Instance variable
    String color;

    // Static final variable
    public static final String TYPE = "Vehicle";

    // Constructor
    public Vehicle2(String color) {
        this.color = color;
    }

    abstract void accelerate();
}

class Car2 extends Vehicle2 {
    public Car2(String color) {
        super(color); // Call to the parent constructor
    }

    void accelerate() {
        System.out.println("Car is accelerating. Color: " + color);
    }
}

class Bike2 extends Vehicle2 {
    public Bike2(String color) {
        super(color); // Call to the parent constructor
    }

    void accelerate() {
        System.out.println("Bike is accelerating. Color: " + color);
    }
}

// Main method to test the classes
public class Demo {

    public static void main(String[] args) {
        Car2 car = new Car2("Red");
        Bike2 bike = new Bike2("Blue");

        car.accelerate(); // Output: Car is accelerating. Color: Red
        bike.accelerate(); // Output: Bike is accelerating. Color: Blue

        // Accessing the static final variable
        System.out.println(Vehicle2.TYPE); // Output: Vehicle
    }
}
