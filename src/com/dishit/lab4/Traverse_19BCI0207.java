package com.dishit.lab4;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Traverse_19BCI0207 {

    public static void main(String [] args) throws FileNotFoundException {
        int count1=0,count2=0;
        String W1="success";
        String W2="hardwork";
        String Line="";
        String FileName="E:\\Java CSE1007\\src\\com\\dishit\\lab4\\words.txt";
        BufferedReader Fin = new BufferedReader(new FileReader(FileName));
        try {
            while((Line=Fin.readLine( ))!= null){
                String[] word=Line.split(" ");
                for(String s:word){
                    if(s.equals(W1)){
                        count1++;
                    }
                    if(s.equals(W2)){
                        count2++;
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Traverse_19BCI0207.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("The No. of words(Success) : "+count1);
        System.out.println("The No. of words(Hardwork) : "+count2);
    }
}