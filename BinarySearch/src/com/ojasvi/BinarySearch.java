package com.ojasvi;
public class BinarySearch {
    public static void main(String[] args) {
        int []arr={-18,-12,-4,0,2,3,3,4,15,16,18,22,45,56};
        int target=15;
        System.out.println(binarysearch(arr,target));


    }
    static int binarysearch(int[]arr,int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }

        }
        return -1;
    }
}
