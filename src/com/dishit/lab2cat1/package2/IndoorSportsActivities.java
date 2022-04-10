package com.dishit.lab2cat1.package2;

import java.util.Scanner;

public class IndoorSportsActivities implements i {
    Scanner sc = new Scanner(System.in);
    String location = "Home";
    String name;
    int time;

    @Override
    public void getActivity() {
        name = sc.nextLine();
        time = sc.nextInt();
    }

    @Override
    public void Print() {
        System.out.println(name + " will play for " + time + " hours at " + location);
    }
}
