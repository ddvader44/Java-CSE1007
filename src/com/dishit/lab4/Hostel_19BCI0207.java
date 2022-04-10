package com.dishit.lab4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

class Student implements Serializable {
    String Name;
    String RegNo;
    Float CGPA;
    int PrefRoom;
    int AllocateRoom;

    Student(String RegNo, String Name, float CGPA, int PrefRoom) {
        this.RegNo = RegNo;
        this.Name = Name;
        this.CGPA = CGPA;
        this.PrefRoom = PrefRoom;
    }

    Student() {
    }

}

class room implements Serializable {
    int roomNo;
    int size;
    int allotedNo;

    room() {
        size = 2;
    }

    room(int roomNo, int size) {
        this.roomNo = roomNo;
        this.size = size;
        this.allotedNo = 0;
    }
}

class hostel implements Serializable {
    String BlockName;
    room r[] = new room[2];
    static int booking;

    hostel(String blockName, int n) {
        this.BlockName = BlockName;
        for (int i = 0; i < n; i++) {
            r[i] = new room();
        }
        r[0] = new room(101, 2);
        r[1] = new room(102, 2);
    }

    synchronized int book(Student[] sortedcgpa) throws InterruptedException {
        for (Student sortedcgpa1 : sortedcgpa) {
            if (sortedcgpa1.AllocateRoom == 0) {
                for (room r1 : r) {
                    if ((sortedcgpa1.PrefRoom == r1.roomNo) && (r1.allotedNo < r1.size)) {
                        sortedcgpa1.AllocateRoom = sortedcgpa1.PrefRoom;
                        r1.allotedNo = r1.allotedNo + 1;
                        booking = booking + 1;
                        if (booking == 1) {
                            wait();
                        }
                        if (booking > 1 && booking < sortedcgpa.length - 2) {
                            notifyAll();
                            wait();
                        }
                        System.out.println(" ");
                        System.out.println("******ALLOTTED STATUS*****");
                        for (Student o1 : sortedcgpa) {
                            System.out.println(o1.RegNo + " " + o1.Name + " " + o1.CGPA + " " + " " + o1.AllocateRoom + " " + o1.PrefRoom);
                        }
                    }
                }
                if (booking == sortedcgpa.length - 1)
                    return 1;
                return 0;
            }
        }
        return 0;
    }
}

class Warden extends Thread {
    hostel b1;
    Student[] sortedcgpa = new Student[5];

    Warden(hostel b1, Student[] sortedcgpa) {
        this.b1 = b1;
        this.sortedcgpa = sortedcgpa;
    }

    public void run() {
        int b = 0;
        try {
            b = b1.book(sortedcgpa);
            if (b == 1) {
                interrupt();
            }
        } catch (Exception ex) {
            System.out.println("Intterupted" + ex);
        }
    }
}

public class Hostel_19BCI0207 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        List<Student> sList = new ArrayList<Student>();

        sList.add(new Student("19BCI0207", "Dishit", 8.4f, 102));
        sList.add(new Student("19BCI0205", "Chirag", 7.2f, 101));
        sList.add(new Student("19BCI0206", "Chaitanya", 9.2f, 102));

        FileOutputStream Fout = new FileOutputStream("E:\\Java CSE1007\\src\\com\\dishit\\lab4\\stu.txt");
        ObjectOutputStream out = new ObjectOutputStream(Fout);
        out.writeObject(sList);
        out.close();

        System.out.println("Done inserting in file");

        FileInputStream fin = new FileInputStream("E:\\Java CSE1007\\src\\com\\dishit\\lab4\\stu.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        ArrayList<Student> nList = new ArrayList<Student>();
        while (fin.available() != 0) {
            nList = (ArrayList<Student>) in.readObject();
        }
        nList.sort((o1, o2) -> {
            return (int) (o1.CGPA - o2.CGPA);
        });
        Collections.reverse(nList);
        nList.forEach(o -> System.out.println(o.RegNo + " " + o.Name + " " + o.CGPA + " " + " " + o.AllocateRoom + " " + o.PrefRoom));
        in.close();
        Student[] sortedcgpa = nList.toArray(new Student[nList.size()]);
        hostel b1 = new hostel("Block1", 2);
        Warden w1 = new Warden(b1, sortedcgpa);
        Warden w2 = new Warden(b1, sortedcgpa);
        w1.start();
        w2.start();
    }
}

