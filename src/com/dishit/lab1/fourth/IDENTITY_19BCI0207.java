package com.dishit.lab1.fourth;
import java.util.Scanner;
public class IDENTITY_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        int i, j, m, n;
        int flag = 0;
        int flagg = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :- ");
        m = sc.nextInt();
        System.out.println("Enter number of columns :- ");
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        if (m == n) {
            System.out.println("Enter Matrix :- ");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++) {
                    if (i == j && arr[i][j] == 1) {
                        flag = 1;
                    }
                    if (i != j && arr[i][j] == 0) {
                        flagg = 1;
                    }
                }
            }
        }
        if (flag == 1 && flagg == 1) {
            System.out.println("Yes, its an identity matrix!");
        } else {
            System.out.println("No, its not an identity matrix!");
        }
    }
}
