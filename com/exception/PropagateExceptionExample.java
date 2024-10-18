package com.exception;

import java.io.IOException;

public class PropagateExceptionExample {

    public static void methodA() throws IOException {
        // Some code that may throw IOException
        throw new IOException("File not found");
    }

    public static void methodB() throws IOException {
        // Propagating the IOException from methodA
        methodA();
    }

    public static void main(String[] args) {
        try {
            methodB(); // MethodB propagates the exception from methodA
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

