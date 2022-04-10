package com.dishit.lab2cat1;

import java.util.Scanner;

public class IQ_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of students:- ");
        n = sc.nextInt();
        int[] iq = new int[n];
        for (int i = 0; i < n; i++) {
            iq[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (iq[i] < iq[j]) {
                    int temp = iq[j];
                    iq[j] = iq[i];
                    iq[i] = temp;
                }
            }
        }
        for(int i=0; i<n; i++) {
            int a = 0;
            System.out.print(iq[i]+" ----> ");
            if (iq[i] >= 144) {
                a = 1;
            } else if (iq[i] >= 85 && iq[i] < 114) {
                a = 2;
            } else if (iq[i] < 85) {
                a = 3;
            }
            switch (a) {
                case 1 -> System.out.println("Genius");
                case 2 -> System.out.println("Average");
                case 3 -> System.out.println("Below Average");
                default -> System.out.println("Invalid Input !");
            }
        }
    }
}
