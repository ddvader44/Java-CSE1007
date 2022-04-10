package com.dishit.lab1.second;

import java.util.Scanner;

public class PATTERN1_19BCI0207 {
    public static void main(String args[]) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        int i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        for (i = 1; i <= rows; i++) {
            for (j = 1; j <= rows; j++) {
                if (i == 2 && j == 3) {
                    System.out.print(" ");
                } else if (i == 3 && j == 2) {
                    System.out.print(" ");
                } else if (i == 3 && j == 3) {
                    System.out.print(" ");
                } else if (i == 3 && j == 4) {
                    System.out.print(" ");
                } else if (i == 4 && j == 3) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
