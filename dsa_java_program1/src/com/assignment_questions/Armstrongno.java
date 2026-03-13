package com.assignment_questions;

import java.util.Scanner;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // to find the armstrong number between two given number
        System.out.println("enter first number:-");
        int num1= input.nextInt();
        System.out.println("enter second number:-");
        int num2= input.nextInt();
        for(int original=num1;original<=num2;original++) {
            int temp =original;
            int n = 0;
            while (temp > 0) {
                temp = temp / 10;
                n++;
            }

            int sum = 0;
            while (original > 0) {
                int i = original % 10;
                original = original / 10;
                sum = (int) (sum + Math.pow(i, n));

            }

            if (sum == temp) {
                System.out.println("Armstrong number");
            } else {
                System.out.println("not Armstrong number");
            }
        }

    }
}
