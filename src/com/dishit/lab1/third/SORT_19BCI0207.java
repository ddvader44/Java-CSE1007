package com.dishit.lab1.third;

import java.util.Scanner;

// Sort an array of element by getting values from user
public class SORT_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        Scanner sc = new Scanner(System.in);
        int n, i, temp;
        System.out.println("Enter number of elements :- ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements :- ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // for sorting (bubble sort)
        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("The sorted order is :- ");
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
