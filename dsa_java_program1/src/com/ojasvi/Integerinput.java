package com.ojasvi;

import java.util.Scanner;

public class Integerinput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter some input ");
        int roll_no= input.nextInt();
        System.out.println("your roll no is :-"+roll_no);

        //int a=10;
        // here 10 is literals ,in primitive data types literals are the syntactical representation of boolean ,char ,number
        // a is indentifier it is a reference variable ;name of variable ,method ,class,interfaces ,packages.
        float num= input.nextFloat();
        System.out.println(num);
    }
}
