package com.ojasvi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        //System.out.println(args[0]);
        Scanner input=new Scanner(System.in);
        System.out.println(input.nextInt());
        System.out.println(input.next());  //get the first word of line or single word
        System.out.println(input.nextLine());// print full line of the input


    }
}