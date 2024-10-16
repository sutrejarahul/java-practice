package com.abstract_practice;

abstract class Animal {
    void eat() { // Concrete method
        System.out.println("This animal is eating.");
    }
    abstract void makeSound(); // Abstract method
}

class Dog extends Animal {
    void makeSound() { // Implementation of abstract method
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meows");
    }
}


public class Example {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();

        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
    }
}
