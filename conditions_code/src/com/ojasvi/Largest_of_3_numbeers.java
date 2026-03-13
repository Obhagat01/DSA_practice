package com.ojasvi;

import java.util.Scanner;

public class Largest_of_3_numbeers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();

//       1st way
//        int max=a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }

//       2nd way
//        int max=0;
//        if(a>b){
//            max=a;
//        }else{
//            max=b;
//        }
//        if(c>max){
//            c=max;
//        }
        // 3rd way
        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
