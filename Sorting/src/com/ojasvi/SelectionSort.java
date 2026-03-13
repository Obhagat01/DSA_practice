package com.ojasvi;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []arr={63,91,35,22,-4};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int last= arr.length-i-1;
            int max=getMaxIndex(arr,0,last);
            swap(arr,last,max);

        }
    }

    private static void swap(int[] arr, int last, int max) {
        int temp=arr[last];
        arr[last]=arr[max];
        arr[max]=temp;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max=start;
        for (int i = start; i <=last; i++) {
            if (arr[max]<arr[i]){
                max=i;
            }

        }
        return max;
    }
}
