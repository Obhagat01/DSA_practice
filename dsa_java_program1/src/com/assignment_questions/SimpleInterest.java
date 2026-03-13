package com.assignment_questions;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter amount of principal:-");
        int p=input.nextInt();
        System.out.print("enter amount of time:-");
        int t=input.nextInt();
        System.out.print("enter value of rate:-");
        float r=input.nextFloat();

        float si=(p*r*t)/100;
        System.out.println("Simple Intererst="+si);
    }
}
