package com.ojasvi;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        float temp=input.nextFloat();
        float f=(temp*(9/5))+32;
        float  k=(temp+273.15f);

        System.out.println("Temperature in faherneit:-"+f);
        System.out.println("Temperature in Kelvin:-"+k);

    }
}
