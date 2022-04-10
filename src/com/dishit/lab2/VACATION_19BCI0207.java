package com.dishit.lab2;

import java.util.Scanner;

class Vacation {
    String place;
    String date;
    String[] activities;
    static int[] cost;
    static int a;

    void getMethod() {
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

    void print() {
        System.out.println("Place: " + place);
        System.out.println("Date: " + date);
        System.out.println("Activities and cost : ");
        for (int i = 0; i < a; i++) {
            System.out.print(activities[i] + "  --->  " + cost[i]);
        }
        System.out.println();
    }
}

class summer_vacation extends Vacation {
    String courseName;
    String onlinePlatform;
    int duration;
    static int courseCost;

    void getMethod() {
        super.getMethod();
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

    @Override
    void print() {
        super.print();
        System.out.println("Course Name is:- " + courseName);
        System.out.println("Online Platform is:- " + onlinePlatform);
        System.out.println("Duration is:- " + duration);
        System.out.println("Course Cost is:- " + courseCost);
    }

    static void totalCost() {
        int totalCost = 0;
        for (int i = 0; i < a; i++) {
            totalCost = totalCost + cost[i];
        }
        totalCost = totalCost + courseCost;
        System.out.println(
                "Total amount spent on vacation is:- " + totalCost
        );
    }
}

public class VACATION_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");

        Vacation v1 = new summer_vacation();
        v1.getMethod();
        v1.print();
        summer_vacation.totalCost();

        Vacation v2 = new summer_vacation();
        v2.getMethod();
        v2.print();
        summer_vacation.totalCost();

    }
}
