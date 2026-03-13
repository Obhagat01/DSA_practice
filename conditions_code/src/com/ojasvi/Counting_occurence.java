package com.ojasvi;

import java.util.Scanner;

public class Counting_occurence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        int n= in.nextInt();
        System.out.println("enter the number of which counting occurency");
        int b= in.nextInt();
        int og=n;
        int count=0;
        while(n>0){
            int a=n%10;

            if(a==b){
                count++;
            }
            n=n/10;
        }
        System.out.println("In number "+og+" the digit "+b+" occurs "+count+" times");

    }
}
