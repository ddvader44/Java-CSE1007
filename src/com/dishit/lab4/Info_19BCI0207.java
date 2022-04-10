package com.dishit.lab4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Info_19BCI0207 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try {
            FileInputStream fin = new FileInputStream("D:\\eg1.txt");
            try (ObjectInputStream obin = new ObjectInputStream(fin)) {
                int j = 0;
                MyInfo obj[] = new MyInfo[2];
                obj[0] = new MyInfo();
                obj[1] = new MyInfo();
                System.out.println("Student Details ");
                System.out.println("************");
                System.out.println("Name" + " " + "\tRegNo" + " " + "\tCgpa" + " " + "\tPhone No");
                while (fin.available() != 0) {
                    obj[j] = (MyInfo) obin.readObject();
                    System.out.println(obj[j].Name + " " + obj[j].RegNo + " " + obj[j].Cgpa + " " + "\t" + obj[j].PhoneNo);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
