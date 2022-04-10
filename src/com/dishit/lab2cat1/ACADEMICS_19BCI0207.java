package com.dishit.lab2cat1;

import java.util.Scanner;
class teacher{
    int id;
    String name;
    int teachinghours, accrelation,evalHours,papers,impact,citation;
    Scanner sc=new Scanner(System.in);
    void GetInfo() {
        System.out.print("Enter teacher id : ");
        id=sc.nextInt();
        name=sc.nextLine();
        System.out.print("Enter teacher name : ");
        name=sc.nextLine();
        System.out.print("Enter Teaching hours: ");
        teachinghours=sc.nextInt();
        System.out.print("Enter Acc relation hours : ");
        accrelation=sc.nextInt();
        System.out.print("Enter Evaluation hours : ");
        evalHours=sc.nextInt();
        System.out.print("Enter No.of Papers : ");
        papers=sc.nextInt();
        System.out.print("Enter Impact factor : ");
        impact=sc.nextInt();
        System.out.print("Enter citation : ");
        citation=sc.nextInt();
        System.out.println();
    }
    void PrintInfo(int i) {
        System.out.println("teacher "+(i+1));
        System.out.println("id---->"+id+"\tname---->"+name);
        System.out.println("------------Academic Activities------------");
        System.out.println("Teaching hours-->"+teachinghours+"\tAcc Relation Hours-->"+accrelation);
        System.out.println("Evaluation hours-->"+evalHours);
        System.out.println("------------Research Activities------------");
        System.out.println("No of papers-->"+papers+"\tImpact factor-->"+impact+"\tCitation-->"+citation);
        System.out.println();
    }
}
public class ACADEMICS_19BCI0207 {
    public static void main(String[] args) {
        teacher[] f =new teacher[3];
        f[0]=new teacher();
        f[1]=new teacher();
        f[2]=new teacher();
        for(int i=0;i<3;i++) {
            f[i].GetInfo();
        }
        int[] a =new int[3];
        for(int i=0;i<3;i++) {
            a[i]=f[i].teachinghours;
        }
        for (int i = 0; i < 3; ++i) {
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = temp;
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(a[i]==f[j].teachinghours) {
                    f[j].PrintInfo(i);
                    break;
                }
            }
        }
    }
}
