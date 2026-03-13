package com.ojasvi;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int sum=0;
//        int count=0;
//        int temp=n;
//        while(temp>0){
//            temp=temp/10;
//            count++;
//        }
//        while(n>0){
//            int rem=n%10;
//            sum=sum+rem*(int)Math.pow(10,count-1);
//            count--;
//            n=n/10;
        while(n>0){
            int rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }

        System.out.println(sum);
    }
}
