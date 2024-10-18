package com.exception;

class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("Custom exception occurred");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

