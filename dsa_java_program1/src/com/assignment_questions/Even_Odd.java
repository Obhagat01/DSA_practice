package com.assignment_questions;

import java.util.Scanner;


public class Even_Odd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Input a number:-");
        int num= input.nextInt();
        if(num%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd");
        }
    }
}
