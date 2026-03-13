package com.ojasvi;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //syntax
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(90);
        list.add(38);
        list.add(45);
        System.out.println(list); //arraylist has inbuilt toString()method in simple system.out.println

        System.out.println(list.contains(45));
        list.set(0,99); //0th index will change to 99
        list.remove(2); //it will remove the 2nd index

        //or we can take input using forloop
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }
        //output
        for(int i=0;i<5;i++){
            System.out.println(list.get(i)); //here pass index;list[index] syntax will not work here
        }
    }
}
