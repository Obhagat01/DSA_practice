package com.ojasvi;

import java.util.Arrays;

public class VarArgs {
    /* variable at argument means bascially when you create method that takes variable number of argument is
    know as Variable Arguments/VarArgs method
    When you don't know how many inputs are passing
     */

    public static void main(String[] args) {
        fun(2,3,4,54,53,3,232,14,23,123,223,45,67,6,43,223,11,12,43);
        fun(2,3,"hello","ojasvi");
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int a,int b,String...v){
        //fun1(int a,String ...v,int b) --this is incorrect variable parameter must be the last in the list
        System.out.println(Arrays.toString(v));
    }
}
