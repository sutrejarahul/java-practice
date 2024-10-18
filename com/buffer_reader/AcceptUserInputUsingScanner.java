package com.buffer_reader;

import java.util.Scanner;

public class AcceptUserInputUsingScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("user entered number :"+number);
    }
}
