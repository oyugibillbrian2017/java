package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// program that calculate the area and the perimeter of a rectangle
        int length,width,area,perimeter;
        Scanner capture=new Scanner(System.in);
        System.out.println("Enter the length of a Rectangle");
        length=capture.nextInt();
        System.out.println("Enter the width of the Rectangle");
        width=capture.nextInt();
        //area of a rectangle
        area=length*width;
        perimeter=2*(length+width);
        System.out.println("Area ofa rectangle:" +area);
        System.out.println("perimeter ofa rectangle:" +perimeter);

    }

}
