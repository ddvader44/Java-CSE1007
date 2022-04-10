package com.dishit.lab1.first;

import java.util.Scanner;

// Generate Fibonacci Series by getting n value from user.

public class FIBONACCI_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter value of n: ");
        n = sc.nextInt();
        int a,b=0,c=1;
        for(int i = 1; i <= n; i++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}
