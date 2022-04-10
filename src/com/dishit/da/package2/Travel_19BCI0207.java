package com.dishit.da.package2;

import com.dishit.da.package1.subpack1.InternationalTravel;
import com.dishit.da.package1.subpack2.NationalTravel;

import java.util.*;
class TravelInfo{
    String Place;
    String yoTravel;
    void GetValues(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the destination you are Planning to Travel:");
        Place=sc.next();
        System.out.print("Enter the Year you are Planning to Travel:");
        yoTravel=sc.next();
    }
    void PrintValues(){
        System.out.println("Destination(Tentative): "+Place);
        System.out.println("Year(Tentative): "+yoTravel);
    }
}

public class Travel_19BCI0207 {

    public static void main(String [] args){
        System.out.println("International Travel");
        System.out.println("--------------");
        InternationalTravel IO1= new InternationalTravel();
        IO1.GetDetails();
        IO1.PrintDetails();
        System.out.println("**********");
        InternationalTravel IO2= new InternationalTravel();
        IO2.GetDetails();
        IO2.PrintDetails();
        System.out.println("**********");
        InternationalTravel IO3= new InternationalTravel();
        IO3.GetDetails();
        IO3.PrintDetails();
        System.out.println(" ");
        System.out.println("National Travel");
        System.out.println("--------------");
        NationalTravel NO1= new NationalTravel();
        NO1.GetDetails();
        NO1.PrintDetails();
        System.out.println("************");
        NationalTravel NO2= new NationalTravel();
        NO2.GetDetails();
        NO2.PrintDetails();
        System.out.println("************");
        NationalTravel NO3= new NationalTravel();
        NO3.GetDetails();
        NO3.PrintDetails();
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Enter the number of places you are planning to Travel: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(" ");
        TravelInfo T[]=new TravelInfo[n];
        for(int i=0;i<n;i++)
        {T[i]= new TravelInfo();
            T[i].GetValues();
            System.out.println("******");
        }
        for(int i=0;i<n;i++)
        {
            T[i].PrintValues();
            System.out.println("******");
        }
    }
}
