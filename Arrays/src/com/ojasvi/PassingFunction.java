package com.ojasvi;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int [] num={1,2,34,3,22};
        System.out.println(Arrays.toString(num));
        change(num);
        System.out.println(Arrays.toString(num));
    }

    private static void change(int[] num) {
        num[0]=99;   // Arrays are mutable
    }

}
