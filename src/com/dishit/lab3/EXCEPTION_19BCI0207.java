package com.dishit.lab3;

import java.util.Scanner;

public class EXCEPTION_19BCI0207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice (1-3) :-  ");
        int n = sc.nextInt();
        switch (n) {
            case 1:
                try {
                    int i = 2 / 0;
                    System.out.println(i);
                } catch (ArithmeticException e) {
                    System.out.println("Error is: " + e);
                }
                break;
            case 2:
                try {
                    String s = null;
                    System.out.println(s.length());
                } catch (NullPointerException e) {
                    System.out.println("Error is: " + e);
                }
                break;
            case 3:
                try {
                    int[] a = new int[8];
                    a[10] = 20;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error is: " + e);
                }
                break;
            default:
                System.out.println("Wrong Choice!");
                break;
        }
    }
}
