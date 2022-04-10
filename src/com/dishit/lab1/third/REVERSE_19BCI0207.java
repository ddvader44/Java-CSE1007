package com.dishit.lab1.third;

import java.util.Scanner;

//Reverse the contents inside an array
public class REVERSE_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter number of elements :- ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements :- ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reverse order : - ");
        for (i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
