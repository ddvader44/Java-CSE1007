package com.dishit.da.package1.subpack1;

import com.dishit.da.package1.Travel;

import java.util.*;

public class InternationalTravel extends Travel {
    public String IntDestination;
    public String FlightNumber;
    public String Airlines;
    public String TravelYear;
    @Override
    public void GetDetails(){
        super.GetDetails();
        Scanner test= new Scanner(System.in);
        System.out.print("Enter the Destination (Arrival):");
        IntDestination=test.next();
        System.out.print("Enter the Airlines by which you are travelling:");
        Airlines=test.next();
        System.out.print("Enter the Flight Number:");
        FlightNumber=test.next();
        System.out.print("Enter the year of your travel:");
        TravelYear=test.next();
        System.out.println("--------------");
    }
    @Override
    public void PrintDetails(){
        super.PrintDetails();
        System.out.println("Destination (Arrival): "+ IntDestination);
        System.out.println("Airlines: "+Airlines);
        System.out.println("Flight Number : "+FlightNumber);
        System.out.println("Year: "+TravelYear);
    }
}