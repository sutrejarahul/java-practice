package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

    // Method declares it throws IOException
    public static void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
        String line = reader.readLine();
        System.out.println(line);
        reader.close();
    }

    public static void main(String[] args) {
        try {
            // Call method that throws IOException
            readFile();
        } catch (IOException e) {
            // Handle the IOException
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}

