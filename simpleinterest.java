package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// program which capture and compute the simple interest
        Float P,R,T,Simpleinterest;
        Scanner capture=new Scanner(System.in);
        System.out.println("Enter the principle rate");
        P=capture.nextFloat();
        System.out.println("Enter the Rate of interest ");
        R=capture.nextFloat();
        System.out.println("Enter the time");
        T=capture.nextFloat();
        Simpleinterest=(P*R*T)/100;
        System.out.println("The simple interest is:" +Simpleinterest);
    }

}