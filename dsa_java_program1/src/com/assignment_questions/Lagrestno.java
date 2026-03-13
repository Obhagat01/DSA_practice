package com.assignment_questions;

import java.util.Scanner;

public class Lagrestno {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input a number1:-");
        int num1= input.nextInt();
        System.out.print("Input a number2:-");
        int num2= input.nextInt();
        if(num1>num2){
            System.out.println(num1);
        }
        else{
            System.out.println(num2);
        }

    }
}
