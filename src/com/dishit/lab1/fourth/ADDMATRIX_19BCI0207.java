package com.dishit.lab1.fourth;
import java.util.Scanner;
public class ADDMATRIX_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        int i, j, m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("For addition, both matrices should have same dimensions!");
        System.out.println("Enter number of rows :- ");
        m = sc.nextInt();
        System.out.println("Enter number of columns :- ");
        n = sc.nextInt();
        int[][] arr1 = new int[m][n];
        int[][] arr2 = new int[m][n];
        System.out.println("Enter Matrix A :- ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Matrix B :- ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The addition is :- ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(arr1[i][j]+arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
