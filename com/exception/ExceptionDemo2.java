package com.exception;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int arr[] = new int[5];
        try {
            j = 18/i;
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("execution complete");
    }
}
