package com.ojasvi;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();

        System.out.println(ifArmstrong(n));

    }
    static int length(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    static boolean ifArmstrong(int n){
        int temp=n;
        int count=length(n);
        int sum=0;
        while(n>0){
            int i=n%10;
            n=n/10;
            sum=sum+(int)Math.pow(i,count);
        }
//        if(sum==temp){
//            return true;
//        }
//       return false;
        return sum==temp;
    }
}
