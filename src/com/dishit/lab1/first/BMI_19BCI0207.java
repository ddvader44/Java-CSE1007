package com.dishit.lab1.first;

import java.util.Scanner;

//Find BMI of a person by getting weight and height in kg and cm respectively from user.
// [Formula BMI = kg/m2]

public class BMI_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        Scanner sc = new Scanner(System.in);
        float weight,height;
        float bmi;
        System.out.println("Enter weight in kg: ");
        weight = sc.nextFloat();
        System.out.println("Enter height in cm: ");
        height = sc.nextFloat();
        bmi = weight*10000/(height*height);
        System.out.println("The BMI is : - ");
        System.out.println(bmi);
    }
}
