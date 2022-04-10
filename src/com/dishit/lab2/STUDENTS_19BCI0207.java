package com.dishit.lab2;

import java.util.Scanner;

class Student {
    String Regno;
    String name;
    static String univ_name = "Vellore Institute of Technology";
    static int d;

    Student() {
        d++;
    }

    static void GetMethod(Student obj) {
        Scanner test = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Name:");
        obj.name = test.nextLine();
        System.out.println("Enter Regno:");
        obj.Regno = test.next();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Registration No: " + Regno);
        System.out.println("University: " + univ_name);
    }
}

class Course {
    String course_code;
    String course_name;
    String venue;
    String slot;

    static void GetMethod(Course b) {
        Scanner test = new Scanner(System.in);
        System.out.println("Enter Course Code:");
        b.course_code = test.next();
        System.out.println("Enter Course Name:");
        b.course_name = test.next();
        System.out.println("Enter Slot:");
        b.slot = test.next();
        System.out.println("Enter Venue:");
        b.venue = test.next();
    }

    void display() {
        System.out.println("Course Code:" + course_code);
        System.out.println("course Name:" + course_name);
        System.out.println("Enter Slot:" + slot);
        System.out.println("Enter Venue:" + venue);
    }
}

public class STUDENTS_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        Scanner sc = new Scanner(System.in);
        Course c1 = new Course();
        Course.GetMethod(c1);
        Course c2 = new Course();
        Course.GetMethod(c2);
        Course c3 = new Course();
        Course.GetMethod(c3);
        Course c4 = new Course();
        Course.GetMethod(c4);
        Student s1 = new Student();
        Student.GetMethod(s1);
        Student s2 = new Student();
        Student.GetMethod(s2);
        c1.display();
        c2.display();
        c3.display();
        c4.display();
        System.out.println("Welcome, "+s1.name+" Enter the number of the course you prefer");
        Course[] subjects_s1 = new Course[2];
        int flag = 0;
        while (flag != 1) {
            for (int i = 0; i < 2; i++) {
                int c = sc.nextInt();
                switch (c) {
                    case 1 -> subjects_s1[i] = c1;
                    case 2 -> subjects_s1[i] = c2;
                    case 3 -> subjects_s1[i] = c3;
                    case 4 -> subjects_s1[i] = c4;
                }
            }
            if (subjects_s1[0].slot.equals(subjects_s1[1].slot)) {
                System.out.println("Slots Clashed. Select other courses");
                flag = 0;
            } else {
                System.out.println("Courses registered successfully!");
                flag = 1;
            }
        }
        System.out.println("Welcome, "+s2.name+" Enter the number of the course you prefer");
        Course[] subjects_s2 = new Course[2];
        int flagg = 0;
        while (flagg != 1) {
            for (int i = 0; i < 2; i++) {
                int c = sc.nextInt();
                switch (c) {
                    case 1 -> subjects_s2[i] = c1;
                    case 2 -> subjects_s2[i] = c2;
                    case 3 -> subjects_s2[i] = c3;
                    case 4 -> subjects_s2[i] = c4;
                }
            }
            if (subjects_s2[0].slot.equals(subjects_s2[1].slot)) {
                System.out.println("Slots Clashed. Select other courses");
                flagg = 0;
            } else {
                System.out.println("Courses registered successfully!");
                flagg = 1;
            }
        }
        System.out.println("-----");
        System.out.println(s1.name + "'s courses are");
        System.out.println("-----");
        subjects_s1[0].display();
        System.out.println("-----");
        subjects_s1[1].display();
        System.out.println("-----");
        System.out.println(s2.name + "'s courses are");
        System.out.println("-----");
        subjects_s2[0].display();
        System.out.println("-----");
        subjects_s2[1].display();
    }

}
