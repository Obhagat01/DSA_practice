package com.ojasvi;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        // to find the nth fibonacci number like at n=7 value is 13 == 0,1,1,2,3,5,7
        int a=0;
        int b=1;
        int count=2; //as already 0,1 is counted so staring from 2
        while(count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;

        }
        System.out.println(b);
    }
}
