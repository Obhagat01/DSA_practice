package com.ojasvi;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int [][]arr={
                {12,34,22,23},
                {345,45,222,11,111},
                {56,8},
                {90,8,5,113}
        };
        int target=90;
        int []ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] search(int[][] arr, int target) {
        for(int r=0;r< arr.length;r++){
            for(int c=0;c< arr[r].length;c++){
                if(arr[r][c]==target) {
                    return new int[]{r, c};
                }
            }
        }
        return new int []{-1,-1};
    }
}
