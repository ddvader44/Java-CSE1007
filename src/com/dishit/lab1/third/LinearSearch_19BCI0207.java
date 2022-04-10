package com.dishit.lab1.third;
import java.util.Scanner;
// Search for an element inside the array using linear search
public class LinearSearch_19BCI0207 {
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
        System.out.println("Enter element to be searched :- ");
        int element = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (arr[i] == element) {
                System.out.printf("%d is found at %dth position ", element, i + 1);
                break;
            }
            if (i == n - 1) {
                System.out.println("Element not found!");
            }
        }
    }
}
