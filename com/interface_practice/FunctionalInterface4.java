package com.interface_practice;

@FunctionalInterface
interface D {
    int sum(int i, int j);
}

public class FunctionalInterface4 {
    public static void main(String[] args) {
        D d = (i, j) -> i + j;
        int sum = d.sum(3,5);
        System.out.println("sum is :"+sum);
    }
}
