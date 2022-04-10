package com.dishit.lab2pt2.package1;

import java.util.Scanner;

public class vacay {
    String place;
    String date;
    String[] activities;
    public static int[] cost;
    public static int a;

    public void getMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter place of vacation:- ");
        place = sc.next();
        System.out.println("Enter the date:- ");
        date = sc.next();
        System.out.println("Enter number of activities performed:- ");
        a = sc.nextInt();
        activities = new String[a];
        cost = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter Activity No. " + i + 1 + ": ");
            activities[i] = sc.next();
            System.out.println("Enter Cost of the Activity (in Rs.) : ");
            cost[i] = sc.nextInt();
        }
    }

    public void print() {
        System.out.println("Place: " + place);
        System.out.println("Date: " + date);
        System.out.println("Activities and cost : ");
        for (int i = 0; i < a; i++) {
            System.out.print(activities[i] + "  --->  " + cost[i]);
        }
        System.out.println();
    }
}
