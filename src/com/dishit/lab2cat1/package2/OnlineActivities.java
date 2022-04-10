package com.dishit.lab2cat1.package2;

import java.util.Scanner;

interface i {
    void getActivity();
    void Print();
}

public class OnlineActivities implements i {
    Scanner sc = new Scanner(System.in);
    String name;
    int time;
    String platform;

    @Override
    public void getActivity() {
        name = sc.nextLine();
        time = sc.nextInt();
        platform = sc.next();
    }

    @Override
    public void Print() {
        System.out.println(name + " will play for " + time + " hours at " + platform);
    }
}

