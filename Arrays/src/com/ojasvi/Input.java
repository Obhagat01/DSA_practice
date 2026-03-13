package com.ojasvi;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        //input using for loop
        int [] arr=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]= in.nextInt();
        }

//        //output using for loop
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        //output using foreach loop
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //output using toString() method
        System.out.println(Arrays.toString(arr)); //to string method has inbuilt added space commas to represent it nicely

        //ARRAYS OF OBJECT
        String [] str=new String[5];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));
    }

}
