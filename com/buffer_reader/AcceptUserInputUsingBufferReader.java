package com.buffer_reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcceptUserInputUsingBufferReader {
    public static void main(String[] args) {
        // directly read user enter value without buffer reader
        // try {
        //  System.out.println("Enter number 1:");
        //  int num = System.in.read();
        //  System.out.println(num);
        // } catch (IOException e) {
        //  throw new RuntimeException(e);
        // }

        // read user enter value using buffer reader
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            System.out.println("Enter number 2:");
            int userEnterValue = Integer.parseInt(bufferedReader.readLine());
            System.out.println(userEnterValue);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
