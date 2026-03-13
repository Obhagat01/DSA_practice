package com.ojasvi;


public class Overloading {
    public static void main(String[] args) {
        fun(3);
        fun("Kunal");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String a ){
        System.out.println(a);
    }
}
