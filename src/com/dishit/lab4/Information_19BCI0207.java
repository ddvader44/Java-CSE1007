package com.dishit.lab4;

import java.io.*;

class MyInfo implements Serializable{
    String Name;
    String RegNo;
    String Cgpa;
    String PhoneNo;
    String favFood;
    String favPlace;
    public MyInfo(){ }
    public MyInfo(String Name,String RegNo,String Cgpa,String PhoneNo,String favFood,String favPlace){
        this.Name=Name;
        this.RegNo=RegNo;
        this.Cgpa=Cgpa;
        this.PhoneNo=PhoneNo;
        this.favFood = favFood;
        this.favPlace= favPlace;
    }
}
public class Information_19BCI0207 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        MyInfo I1=new MyInfo("Dishit","19BCI0207","8.9","7976523382","Pizza","Germany");
        MyInfo I2=new MyInfo("Hemant","19BCI0001","9.1","1234567890","Maggi","India");
        try{
            FileOutputStream fout=new FileOutputStream("E:\\Java CSE1007\\src\\com\\dishit\\lab4\\info.txt");
            ObjectOutputStream ob= new ObjectOutputStream(fout);
            ob.writeObject(I1);
            ob.writeObject(I2);
            ob.close( );
            System.out.println("Info stored successfully");
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
        try {
            FileInputStream fin = new FileInputStream("E:\\Java CSE1007\\src\\com\\dishit\\lab4\\info.txt");
            try (ObjectInputStream obin = new ObjectInputStream(fin)) {
                int j = 0;
                MyInfo obj[] = new MyInfo[2];
                obj[0] = new MyInfo();
                obj[1] = new MyInfo();
                System.out.println("Student Details ");
                System.out.println("************");
                System.out.println("Name" + " " + "\tRegNo" + " " + "\tCgpa" + " " + "\tPhone No"+ " " + "\tFav Food"+ " " + "\tFav Place");
                while (fin.available() != 0) {
                    obj[j] = (MyInfo) obin.readObject();
                    System.out.println(obj[j].Name + " " + obj[j].RegNo + " " + obj[j].Cgpa + " " + "\t" + obj[j].PhoneNo + "  "+obj[j].favFood+"\t\t"+obj[j].favPlace);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}