package com.ojasvi;

import java.util.Scanner;

public class ColNoFixed {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int [][] arr={
                {1,2,3,4},
                {4,5,6},
                {5,6}
        };

        for(int r=0;r< arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println("");
        }

    }
}
