package com.dishit.lab2cat1.package1;

import com.dishit.lab2cat1.package2.*;

import java.util.Scanner;

abstract class LockdownActivities {
    abstract void get();
}
class ch extends LockdownActivities {

    @Override
    void get() {
        IndoorSportsActivities isa = new IndoorSportsActivities();
        isa.getActivity();
        isa.Print();
        OnlineActivities oa = new OnlineActivities();
        oa.getActivity();
        oa.Print();
    }
}
public class Lockdown_19BCI0207 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                                        Solved by DISHIT - 19BCI0207 ");
        Scanner sc = new Scanner(System.in);
        ch a = new ch();
        a.get();
    }
}
