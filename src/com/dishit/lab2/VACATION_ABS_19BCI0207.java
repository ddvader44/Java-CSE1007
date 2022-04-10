package com.dishit.lab2;

import java.util.Scanner;

abstract class vacation {
    String place;
    String date;
    String[] activities;
    static int[] cost;
    static int a;

    abstract void GetMethod();

    abstract void Print();
}

class summer_Vacation extends vacation {
    String courseName;
    String onlinePlatform;
    int duration;
    static int courseCost;

    void GetMethod(vacation V) {
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

    void GetMethod() {
        GetMethod(this);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course Name: ");
        courseName = sc.nextLine();
        System.out.println("Enter the platform: ");
        onlinePlatform = sc.next();
        System.out.println("Enter duration in weeks: ");
        duration = sc.nextInt();
        System.out.println("Enter cost of the course: ");
        courseCost = sc.nextInt();
    }

    void Print(vacation obj) {
        System.out.println("Place: " + place);
        System.out.println("Date: " + date);
        System.out.println("Activities and cost : ");
        for (int i = 0; i < a; i++) {
            System.out.print(activities[i] + "  --->  " + cost[i]);
        }
        System.out.println();
    }

    @Override
    void Print() {
        Print(this);
        System.out.println("Course Name is:- " + courseName);
        System.out.println("Online Platform is:- " + onlinePlatform);
        System.out.println("Duration is:- " + duration);
        System.out.println("Course Cost is:- " + courseCost);
    }

    static void totalCost() {
        int tCost = 0;
        for (int i = 0; i < a; i++) {
            tCost = tCost + cost[i];
        }
        tCost = tCost + courseCost;
        System.out.println(
                "Total amount spent on vacation is:- " + tCost
        );
    }
}

public class VACATION_ABS_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");

        vacation v1 = new summer_Vacation();
        v1.GetMethod();
        v1.Print();
        summer_Vacation.totalCost();

        vacation v2 = new summer_Vacation();
        v2.GetMethod();
        v2.Print();
        summer_Vacation.totalCost();

    }
}
