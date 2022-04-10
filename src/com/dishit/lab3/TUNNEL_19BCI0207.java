package com.dishit.lab3;
import java.util.Random;
class Cars extends Thread {
    int count;
    int countt;
    Cars() {
        count = 9; // initial value given in constructor
    }
    synchronized void cityToOuter(int a) {
        if (count < a) {
            System.out.println("Car can go from city to outer");

        } else {
            System.out.println("Please wait");

            try {
                Thread.sleep(5);
                wait();
                count = 15;
                notifyAll();
            } catch (Exception e) {
                System.out.println("Exception Caught: - " + e);
            }
        }
    }

    synchronized void outerToCity(int b) {
        if (count < b) {
            System.out.println("Car can go from outer to city");

        } else {
            System.out.println("Please wait");

            try {
                wait(); // waiting for cars to pass
                countt = 11;
                notifyAll();
            } catch (Exception e) {
                System.out.println("Exception Caught: - " + e);
            }
        }
    }

}

public class TUNNEL_19BCI0207 {

    public static void main(String[] args) {
        Cars c = new Cars();
        Random rand = new Random();
        int max = 15;
        int maxx = 11;
        int a = rand.nextInt(max);
        int b = rand.nextInt(maxx);
        new Thread(() -> {
            c.cityToOuter(a);
            if (a >= 10) {
                System.out.println("All cars can go to outer");
            } else {
                System.out.println("Please Wait");
            }
        }).start();
        new Thread(() -> {
            c.outerToCity(b);
            if (b >= 10) {
                System.out.println("All cars can go to city");
            } else {
                System.out.println("Please Wait");
            }
        }).start();
    }
}
