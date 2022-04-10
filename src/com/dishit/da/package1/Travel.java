package com.dishit.da.package1;

import java.util.*;
public abstract class Travel {
    public String Name;
    public String DDestination;
    public void GetDetails(){
        Scanner test=new Scanner(System.in);
        System.out.print("Enter the Name of the Passenger travelling:");
        Name=test.nextLine();
        System.out.print("Enter the Destination (Departure):");
        DDestination=test.next();
    }
    public void PrintDetails(){
        System.out.println("***DETAILS OF TRAVEL***");
        System.out.println("Name of passenger: "+Name);
        System.out.println("Destination (Departure): "+DDestination);
    }
}
