package com.ojasvi;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={1,34,45,22,11,110};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        ReverseArray1(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int index1,int index2){
        int temp=arr[index2];
        arr[index2]=arr[index1];
        arr[index1]=temp;
    }
    static void reverse(int []arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }


    static void ReverseArray1(int []arr){
        int start=0;
        int end=arr.length-1;
        if(start<end){
            swap1(arr,start,end);
            start++;
            end--;
        }
    }

    private static void swap1(int[] arr, int start, int end) {
        int temp=arr[end];
        arr[end]=arr[start];
        arr[start]=temp;
    }

}
