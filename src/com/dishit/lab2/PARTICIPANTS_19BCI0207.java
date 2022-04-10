package com.dishit.lab2;

import java.util.Scanner;

class Participants {
    static String Name;
    static String Branch;
    static String University;
    static String Test_Result;
    static long Phno;

    void getValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:- ");
        Name = sc.nextLine();
        System.out.println("Phno:- ");
        Phno = sc.nextLong();
        System.out.println("Branch:- ");
        Branch = sc.next();
        System.out.println("University:- ");
        University = sc.next();
        System.out.println("Test Result:- ");
        Test_Result = sc.next();
    }

    static void finalResult(Participants n) {
        System.out.println("-----RESULT-----");
        switch (Test_Result) {
            case "L1":
                System.out.println("Dear " + Name + ", You have been selected for both Full Time Internship as well as Full Time Job!");
                break;
            case "L2":
            case "L3":
                System.out.println("Dear " + Name + ", You have been selected for Full Time Internship but Full Time Job will be offered based on Internship Performance!");
                break;
            case "L4":
            case "L5":
                System.out.println("Dear " + Name + ", You have been selected for 21 days Internship!");
                break;
            default:
                System.out.println("Invalid Input!");

        }
    }

}

public class PARTICIPANTS_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of participants: - ");
        int n = sc.nextInt();
        Participants pp[] = new Participants[n];
        for (int i = 0; i < n; i++) {
            pp[i] = new Participants();
            pp[i].getValue();
            Participants.finalResult(pp[i]);
        }
    }
}
