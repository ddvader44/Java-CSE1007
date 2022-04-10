package com.dishit.lab1.second;

import java.util.Scanner;

public class PATTERN2_19BCI0207 {
    public static void main(String args[]) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = i * 2; k <= rows * 2 - 1; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= rows - 1; i++) {
            for (int j = rows - 1; j >= i; j--) {
                System.out.print("*");
            }
            for (int k = 1; k <= i * 2; k++) {
                System.out.print(" ");
            }
            for (int l = rows - 1; l >= i; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

