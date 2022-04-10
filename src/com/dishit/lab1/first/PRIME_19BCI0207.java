package com.dishit.lab1.first;
import java.util.Scanner;
//Print all prime numbers in a given range.
public class PRIME_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        Scanner sc = new Scanner(System.in);
        int a,b,i,j,check;
        System.out.println("Enter lower bound:- ");
        a = sc.nextInt();
        System.out.println("Enter upper bound:- ");
        b = sc.nextInt();
        System.out.println("The prime numbers in between upper and lower bound are : - ");
        for(i=a;i<=b;i++){
            if(i==0 || i==1) {
                continue;
            }
            check = 0; // for prime
            for (j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    check = 1; // means it is not prime
                    break;
                }
            }
            if(check==0){
                System.out.println(i);
            }
        }
    }
}
