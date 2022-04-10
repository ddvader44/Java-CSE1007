package com.dishit.lab2pt2.package1.subpack1;

import com.dishit.lab2pt2.package1.vacay;

import java.util.Scanner;

public class summer_vacay extends vacay {
    String courseName;
    String onlinePlatform;
    int duration;
    static int courseCost;

    public void getMethod() {
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
    public void print() {
        super.print();
        System.out.println("Course Name is:- " + courseName);
        System.out.println("Online Platform is:- " + onlinePlatform);
        System.out.println("Duration is:- " + duration);
        System.out.println("Course Cost is:- " + courseCost);
    }

    public static void totalCost() {
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
