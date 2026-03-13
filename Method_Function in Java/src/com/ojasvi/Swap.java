package com.ojasvi;

public class Swap {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        //swap two number
//        int temp=b;
//        b=a;
//        a=temp;
//        System.out.println(a +" "+ b);

         swap(a,b);
        System.out.println(a+" "+b); //when done using function it is not swapping values
    }

     static void swap(int m,int n) {
         int temp=n;
         n=m;
         m=temp;

        //this change will only be valid inside this function scope only.

     }
    // now doing it using method

}

