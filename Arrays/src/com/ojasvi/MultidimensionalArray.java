package com.ojasvi;

import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       // int [][] arr=new int[3][]; numbers of rows are mandatory and numbers of column are not mandatory

        //Input
        int [][] arr=new int[3][2];

        for(int rows=0;rows< arr.length;rows++){
            for(int col=0;col<arr[rows].length;col++){
                arr[rows][col]= in.nextInt();
            }
        }

        //Output
        for(int rows=0;rows< arr.length;rows++){
            for(int col=0;col<arr[rows].length;col++){
                System.out.print( arr[rows][col]+" ");
            }
            System.out.println();
        }

        //output using toString() method
        for(int r=0;r< arr.length;r++){
            System.out.println(Arrays.toString(arr[r]));
        }

        //output using foreach loop
        for(int [] a:arr){
            System.out.println(a);
        }
    }
}
