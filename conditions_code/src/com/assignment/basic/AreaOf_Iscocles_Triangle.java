package com.assignment.basic;

import java.util.Scanner;

public class AreaOf_Iscocles_Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of base of triangle:-");
        int b= sc.nextInt();
        System.out.print("Enter the value of height of triangle:-");
        int h= sc.nextInt();
        float area=0.5f*b*h;
        System.out.println("The area of Triangle is :-"+area);
    }
}
