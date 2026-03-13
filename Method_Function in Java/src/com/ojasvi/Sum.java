package com.ojasvi;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
         int ans=sum();
        System.out.println(ans);
        int ans1=sum2(5,67);
        System.out.println(ans1);

    }
//    static void sum(){
//        Scanner in=new Scanner(System.in);
//        System.out.print("Enter first number:-");
//        int n1= in.nextInt();
//        System.out.print("Enter the second number:-");
//        int n2=in.nextInt();
//        int sum=n1+n2;
//        System.out.println(sum);
//    }
    static int sum(){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter first number:-");
        int n1= in.nextInt();
        System.out.print("Enter the second number:-");
        int n2=in.nextInt();
        int sum=n1+n2;
        return sum;
    }
    static int sum2(int a,int b){
        int sum=a+b;
        return sum;
    }
}
