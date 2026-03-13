package com.ojasvi;

public class MinInArray {
    public static void main(String[] args) {
        int []arr={3,56,35,2,1,4,-6,6,45,3};
        System.out.println(min(arr));
    }
    //assume arr.length!=0
    private static int min(int[] arr) {
        int mini=arr[0];
        for(int i=0;i< arr.length;i++){
            if(mini>arr[i]){
                mini=arr[i];
            }
        }
        return mini;
    }
}
