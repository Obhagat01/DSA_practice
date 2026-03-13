package com.ojasvi;

import java.util.Arrays;

public class MAX_IN_2D {

        public static void main(String[] args) {
            int [][]arr={
                    {12,34,22,23},
                    {345,45,222,11,111},
                    {56,8},
                    {90,8,5,113}
            };
            System.out.println(max(arr));
        }



    private static int max(int[][] arr) {
            int maxno=Integer.MIN_VALUE;
            for(int r=0;r< arr.length;r++){
                for(int c=0;c< arr[r].length;c++){
                    if(arr[r][c]>maxno) {
                        maxno=arr[r][c];
                    }
                }
            }
            return maxno;
        }


}
