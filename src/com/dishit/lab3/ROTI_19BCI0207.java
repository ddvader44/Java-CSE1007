package com.dishit.lab3;

class roti_making_taking {
    int count_roti = 0;

    synchronized void rotiTaken(int count_roti) {
        if (count_roti > this.count_roti) {
            System.out.println("Taking Roti");
            System.out.println("Child is waiting for roti to be made....");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        this.count_roti -= count_roti;
        System.out.println("Roti taken by child");
        System.out.println("The number of rotis are " + this.count_roti);
    }

    synchronized void rotimade(int count_roti) {
        if (count_roti >= 10 - this.count_roti) {
            System.out.println("The roti stack is full");
            System.out.println("Waiting for child to eat the roti");
        }
        this.count_roti += count_roti;
        System.out.println("Roti made my mom");
        System.out.println("The number of rotis are " + this.count_roti);
        notify();
    }
}

public class ROTI_19BCI0207 {
    public static void main(String[] args) {
        roti_making_taking obj = new roti_making_taking();
        new Thread() {
            public void run() {
                obj.rotiTaken(1);
            }
        }.start();
        new Thread() {
            public void run() {
                obj.rotimade(3);
            }
        }.start();
        new Thread() {
            public void run() {
                obj.rotiTaken(1);
            }
        }.start();
    }
}
