package com.assignment.basic;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of radius:-");
        int r= sc.nextInt();
        float area= (float)3.14*r*r;
        //float ar=3.14f*r*r;
        System.out.println("The area of circle is :-"+area);
    }
}
