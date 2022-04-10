package com.dishit.lab3;

import java.util.Scanner;

public class UserDefinedException_19BCI0207 extends Exception {
    public int n;
    public UserDefinedException_19BCI0207() {
        System.out.println("Input is less then 0 (Not Accepted) ");
    }
    public UserDefinedException_19BCI0207 (int x,int y) {
        System.out.println("Input cannot be in the range "+x+" and "+y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=1;
        while(i==1){
            try{
                int flag = -1;
                System.out.println("Enter the input: ");
                int n = sc.nextInt();
                System.out.println("Enter range of numbers: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                try{
                    if(n<0)
                        throw new UserDefinedException_19BCI0207();
                } catch (UserDefinedException_19BCI0207 userDefinedException_19BCI0207) {
                    System.out.println("Exception Caught");
                    flag=0;
                }
                if(n>=0 && n<=25){
                    throw new UserDefinedException_19BCI0207(0,25);
                }
                if(flag!=0){
                    System.out.println(n+" is valid");
                }
            }
            catch (UserDefinedException_19BCI0207 userDefinedException_19BCI0207) {
                System.out.println("Exception Caught");
            }
            catch (Exception e){
                System.out.println("Exception");
            }
            finally {
                System.out.println("-----------");
                System.out.println("Enter 1 to continue or 0 to exit");
                i = sc.nextInt();
                if(i==0){
                    System.exit(0);
                }
            }
        }
    }
}
