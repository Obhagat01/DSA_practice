package com.ojasvi;

import java.util.Arrays;

public class ChangingValue {
    public static void main(String[] args) {
        int []arr={1,2,3,45,34};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] num) {
        num[0]=99;//if you make change to the object via the reference variable ,same object will be changed
    }
}
