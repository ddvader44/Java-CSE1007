package com.dishit.da.package1.subpack2;

import com.dishit.da.package1.Travel;

import java.util.*;
public class NationalTravel extends Travel {
    public String NatDestination;
    public String FlightNumber;
    public String Airlines;
    public String TravelYear;
    @Override
    public void GetDetails(){
        super.GetDetails();
        Scanner test= new Scanner(System.in);
        System.out.print("Enter the Destination (Arrival):");
        NatDestination=test.next();
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
        System.out.println("Destination (Arrival): "+NatDestination);
        System.out.println("Airlines: "+Airlines);
        System.out.println("flight Number : "+FlightNumber);
        System.out.println("Year: "+TravelYear);
    }}