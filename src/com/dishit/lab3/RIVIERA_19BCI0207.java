package com.dishit.lab3;

import java.util.Random;

class Registration_19BCI0207 {
    int[] arr;
    Registration_19BCI0207(int[] arr) {
        this.arr = arr;
    }
    int count;
    int not_reg;
    int E1;
    int E2;
    int E3;
    int E4;
    int E5;

    synchronized void count(int x) {
        for (int i = 0; i <= 999; i++) {
            if (x == 1 && arr[i] == 1) {
                E1++;
                count++;
            } else if (x == 2 && arr[i] == 2) {
                E2++;
                count++;
            } else if (x == 3 && arr[i] == 3) {
                E3++;
                count++;
            } else if (x == 4 && arr[i] == 4) {
                E4++;
                count++;
            } else if (x == 5 && arr[i] == 5) {
                E5++;
                count++;
            } else if (x == 0 && arr[i] == 0) {
                not_reg++;
            }
        }
    }

    public void display() {
        System.out.println("The Number Of Students Registered For Event 1 Is " + E1 + "\n");
        System.out.println("The Number Of Students Registered For Event 2 Is " + E2 + "\n");
        System.out.println("The Number Of Students Registered For Event 3 Is  " + E3 + "\n");
        System.out.println("The Number Of Students Registered For Event 4 Is  " + E4 + "\n");
        System.out.println("The Number Of Students Registered For Event 5 Is " + E5 + "\n");
        System.out.println("The Total Number of Students are " + count + "\n");
        System.out.println("The Total Number of Students Not Registered are " + not_reg);
    }
}

public class RIVIERA_19BCI0207 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[1000];
        for (int i = 0; i <= 999; i++) {
            arr[i] = r.nextInt(6);
        }
        Registration_19BCI0207 obj = new Registration_19BCI0207(arr);
        new Thread() {
            public void run() {
                obj.count(1);
            }
        }.start();
        new Thread() {
            public void run() {
                obj.count(2);
            }
        }.start();
        new Thread() {
            public void run() {
                obj.count(3);
            }
        }.start();
        new Thread() {
            public void run() {
                obj.count(4);
            }
        }.start();
        new Thread() {
            public void run() {
                obj.count(5);
            }
        }.start();
        new Thread() {
            public void run() {
                obj.count(0);
                obj.display();
            }
        }.start();
    }
}

