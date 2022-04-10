package com.dishit.lab1.fourth;
import java.util.Scanner;
public class ROWSUM_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        int i, j, m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows :- ");
        m = sc.nextInt();
        System.out.println("Enter number of columns :- ");
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter Matrix :- ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The sum of rows of the entered matrix is :- ");
        for(i=0;i<m;i++){
            int sum=0;
            for(j=0;j<n;j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
