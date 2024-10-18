package com.buffer_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptUserInputUsingBufferReader2 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter Number :");
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            int number = Integer.parseInt(bufferedReader.readLine());
            System.out.println("user entered number :"+number);
        }
    }
}
