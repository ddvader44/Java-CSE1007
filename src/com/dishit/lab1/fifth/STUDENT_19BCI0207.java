package com.dishit.lab1.fifth;
import java.util.Scanner;
class Student {
    String Regno;
    String Name;

    void GetMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Reg No. :- ");
        Regno = sc.nextLine();
        System.out.print("Name :- ");
        Name = sc.nextLine();
    }

    void PrintMethod() {
        System.out.println("The Reg No. is: " + Regno);
        System.out.println("The Name is: " + Name);
    }
}

class Courses {
    String CourseCode;
    String slot;
    String venue;

    void GetMethod() {
        Scanner sc = new Scanner(System.in);
        System.out.print("CourseCode :- ");
        CourseCode = sc.nextLine();
        System.out.print("Slot :- ");
        slot = sc.nextLine();
        System.out.print("Venue :- ");
        venue = sc.nextLine();
    }

    void PrintMethod() {
        System.out.println("The Course Code is: " + CourseCode);
        System.out.println("The Slot is: " + slot);
        System.out.println("The Venue is: " + venue);
    }
}

public class STUDENT_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        Student s1 = new Student();
        Courses c1 = new Courses();
        s1.GetMethod();
        c1.GetMethod();
        System.out.println("------------------------");
        Student s2 = new Student();
        Courses c2 = new Courses();
        s2.GetMethod();
        c2.GetMethod();
        System.out.println("------------------------");
        Student s3 = new Student();
        Courses c3 = new Courses();
        s3.GetMethod();
        c3.GetMethod();
        System.out.println("------------------------");
        System.out.println("Student Details :- ");
        s1.PrintMethod();
        c1.PrintMethod();
        System.out.println("------------------------");
        s2.PrintMethod();
        c2.PrintMethod();
        System.out.println("------------------------");
        s3.PrintMethod();
        c3.PrintMethod();
        System.out.println("------------------------");
    }
}

