package com.dishit;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Parent_19BCI0207 {
    String Empid;
    String Name;
    String Phno;
    String coursecode;
    String coursename;
}
    class Members_19BCI0207 extends Parent_19BCI0207{
        int NumberOfTimesHandledEarlier;
        void getDetails(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Employee ID ");
            String empid=sc.nextLine();
            super.Empid=empid;
            System.out.println("Enter Name ");
            String name=sc.nextLine();
            super.Name=name;
            System.out.println("Enter Phone number ");
            String phno=sc.nextLine();
            super.Phno=phno;
            System.out.println("Enter Course code (in digits) ");
            String Coursecode=sc.nextLine();
            super.coursecode=Coursecode;
            System.out.println("Enter Course name ");
            String Coursename=sc.nextLine();
            super.coursename=Coursename;
            System.out.println("How many times has this Prof handled this course before? ");
            NumberOfTimesHandledEarlier=sc.nextInt();
        }
    }

class Moderator_19BCI0207 extends Parent_19BCI0207{
    String WhetherHandledEarlier;
    String Designation;
    void getDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee ID ");
        String empid=sc.nextLine();
        super.Empid=empid;
        System.out.println("Enter Name ");
        String name=sc.nextLine();
        super.Name=name;
        System.out.println("Enter Phone number ");
        String phno=sc.nextLine();
        super.Phno=phno;
        System.out.println("Enter Course code (in digits) ");
        String Coursecode=sc.nextLine();
        super.coursecode=Coursecode;
        System.out.println("Enter Course name ");
        String Coursename=sc.nextLine();
        super.coursename=Coursename;
        System.out.println("Has the Professor handles this course before");
        WhetherHandledEarlier=sc.nextLine();
        System.out.println("Enter the designation: ");
        Designation=sc.nextLine();
    }
}

public class HOD_19BCI0207 {
    public static void main(String[] args) throws Exception {
        Members_19BCI0207 member1=new Members_19BCI0207();
        Members_19BCI0207 member2=new Members_19BCI0207();
        Moderator_19BCI0207 moderator1=new Moderator_19BCI0207();
        member1.getDetails();
        File fout = new File("E:\\Java CSE1007\\src\\com\\dishit\\Member.txt");
        FileWriter fwrite = new FileWriter(fout);
        fwrite.write(member1.Empid+"-"+member1.Name+"-"+member1.Phno+"-"+member1.coursecode+"-"+
                member1.coursename+"-"+ member1.NumberOfTimesHandledEarlier);

        member2.getDetails();
        File foutt = new File("E:\\Java CSE1007\\src\\com\\dishit\\Member.txt");
        FileWriter fwritee = new FileWriter(foutt);
        fwritee.write(member2.Empid+"-"+member2.Name+"-"+member2.Phno+"-"+member2.coursecode+"-"+
                member2.coursename+"-"+ member2.NumberOfTimesHandledEarlier);

        moderator1.getDetails();
        File fou = new File("E:\\Java CSE1007\\src\\com\\dishit\\Moderator.txt");
        FileWriter fwrit = new FileWriter(fou);
        fwrit.write(moderator1.Empid+"-"+moderator1.Name+"-"+moderator1.Phno+"-"+moderator1.coursecode+"-"+
                moderator1.coursename+"-"+ moderator1.WhetherHandledEarlier+"-"+moderator1.Designation);

        try{
            File fin=new File("E:\\Java CSE1007\\src\\com\\dishit\\Moderator.txt");
            Scanner read=new Scanner(fin);
            String data="";
            while(read.hasNextLine()){
                data=read.nextLine();
                System.out.println(data);
            }
        }catch(Exception e){
            System.out.println(e);
        }


    }
}
