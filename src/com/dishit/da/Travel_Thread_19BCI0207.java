package com.dishit.da;

import java.io.*;
import java.util.*;

class InternationalTravel extends Thread implements Serializable {
    public String IntDestination;
    public String FlightNumber;
    public String Airlines;
    public String TravelYear;
    public String Name;
    public String DDestination;

    synchronized void getDetails() throws IOException {
        Scanner test= new Scanner(System.in);
        System.out.print("Enter the Name of the Passenger travelling:");
        Name=test.nextLine();
        System.out.print("Enter the Destination (Departure):");
        DDestination=test.next();
        System.out.print("Enter the Destination (Arrival):");
        IntDestination=test.next();
        System.out.print("Enter the Airlines by which you are travelling:");
        Airlines=test.next();
        System.out.print("Enter the Flight Number:");
        FlightNumber=test.next();
        System.out.print("Enter the year of your travel:");
        TravelYear=test.next();
        System.out.println("--------------");
        System.out.println("---DETAILS OF TRAVEL---");
        System.out.println("Name of passenger: "+Name);
        System.out.println("Destination (Departure): "+DDestination);
        System.out.println("Destination (Arrival): "+ IntDestination);
        System.out.println("Airlines: "+Airlines);
        System.out.println("Flight Number : "+FlightNumber);
        System.out.println("Year: "+TravelYear);
        System.out.println("Writing to File");
        FileWriter fout = new FileWriter("E:\\Java CSE1007\\src\\com\\dishit\\da\\international.txt",true);
        fout.write(Name+"-"+DDestination+"-"+IntDestination+"-"+Airlines+"-"+FlightNumber+"-"+TravelYear+"\n");
        fout.close();
        System.out.println("Successfully written to file!");
    }
}
class NationalTravel extends Thread implements Serializable {
    public String NatDestination;
    public String FlightNumber;
    public String Airlines;
    public String TravelYear;
    public String Name;
    public String DDestination;

    synchronized void GetDetails() throws IOException {
        Scanner test = new Scanner(System.in);
        System.out.print("Enter the Name of the Passenger travelling:");
        Name=test.nextLine();
        System.out.print("Enter the Destination (Departure):");
        DDestination=test.next();
        System.out.print("Enter the Destination (Arrival):");
        NatDestination = test.next();
        System.out.print("Enter the Airlines by which you are travelling:");
        Airlines = test.next();
        System.out.print("Enter the Flight Number:");
        FlightNumber = test.next();
        System.out.print("Enter the year of your travel:");
        TravelYear = test.next();
        System.out.println("--------------");
        System.out.println("***DETAILS OF TRAVEL***");
        System.out.println("Name of passenger: "+Name);
        System.out.println("Destination (Departure): "+DDestination);
        System.out.println("Destination (Arrival): "+NatDestination);
        System.out.println("Airlines: "+Airlines);
        System.out.println("flight Number : "+FlightNumber);
        System.out.println("Year: "+TravelYear);
        System.out.println("Writing to File");
        FileWriter fout = new FileWriter("E:\\Java CSE1007\\src\\com\\dishit\\da\\national.txt",true);
        fout.write(Name+"-"+DDestination+"-"+NatDestination+"-"+Airlines+"-"+FlightNumber+"-"+TravelYear+"\n");
        fout.close();
        System.out.println("Successfully written to file!");
    }
}

public class Travel_Thread_19BCI0207 {

    public static void main(String[] args) throws InterruptedException {
        InternationalTravel it1 = new InternationalTravel();
        InternationalTravel it2 = new InternationalTravel();
        InternationalTravel it3 = new InternationalTravel();
        NationalTravel nt1 = new NationalTravel();
        NationalTravel nt2 = new NationalTravel();
        NationalTravel nt3 = new NationalTravel();

        Thread t1 = new Thread(() -> {
            try {
                it1.getDetails();
                it2.getDetails();
                it3.getDetails();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t1.join();

        Thread t2 = new Thread(() -> {
            try {
                nt1.GetDetails();
                nt2.GetDetails();
                nt3.GetDetails();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        t2.start();
        t2.join();

        Thread t3 = new Thread(() -> {
            try {
                File myObj = new File("E:\\Java CSE1007\\src\\com\\dishit\\da\\international.txt");
                Scanner myReader = new Scanner(myObj);
                String data="";
                while (myReader.hasNextLine()) {
                   data = myReader.nextLine();
                }
                ArrayList<String> IT = new ArrayList<>();
                IT.add(data);
                myReader.close();

                File myObj1 = new File("E:\\Java CSE1007\\src\\com\\dishit\\da\\national.txt");
                Scanner myReader1 = new Scanner(myObj1);
                String data1="";
                while (myReader1.hasNextLine()) {
                    data1 = myReader1.nextLine();
                }
                ArrayList<String> NT = new ArrayList<>();
                NT.add(data1);
                myReader1.close();

                System.out.println("Data stored in Collection Successfully");

            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        });

        t3.start();
    }
}

