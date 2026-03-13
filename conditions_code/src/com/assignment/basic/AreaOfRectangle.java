package com.assignment.basic;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of length of rectangle:-");
        int l= sc.nextInt();
        System.out.print("Enter the value of breadth of rectangle:-");
        int b= sc.nextInt();
        int area=l*b;
        System.out.println("The area of rectangle is "+area);
    }
}
