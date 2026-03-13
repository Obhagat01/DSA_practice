package com.assignment_questions;

import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int count=1;
        int a=0;
        int b=1;
        System.out.println(a);
        while(count<n){
            int c=a+b;

            System.out.println(c);
            b=a;
            a=c;

            count++;

        }
    }
}
