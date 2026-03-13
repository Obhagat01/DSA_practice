package com.ojasvi;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr={3,1,5,4,2};
        Bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubblesort(int []arr){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<= arr.length-1-i;j++){
                if(arr[j-1]>arr[j]){
                    //then swap the elements
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(swapped==false){
                break; //if the array is sorted and no  swapped occured for particular value of i the break that is stop array is sorted
            }
        }

    }
}