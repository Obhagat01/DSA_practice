package com.ojasvi;

public class InfiniteSortedArray {
    public static void main(String[] args) {


        //to find the position of  target element in a sorted array of infinite array
        //Imagine this array is infinite so we can't use the arr.length here
        // we will move in chunks,we can do this via increasing the window size like 2,4,8,.. it will also need LogN steps to reach N
        int[] arr = {1, 2, 3, 5, 13, 14, 16, 17, 19, 21, 25, 26, 29, 34, 36, 38, 43, 49, 51, 53, 55, 58, 67, 68, 69, 78, 89};
        int target = 69;
        System.out.println(search(arr, target));
    }

    //    private static int search(int[] arr, int target) {
//
//        int start=0;
//        int end=1;
//            while(target>arr[end]) {
//                int temp = end + 1;
//                end = end + (end - start + 1) * 2;
//                start=temp;
//
//            }
//            while(start<=end){
//                int mid = start + (end - start) / 2;
//                if (target > arr[mid]) {
//                    start = mid + 1;
//                } else if (target < arr[mid]) {
//                    end = mid - 1;
//                } else {
//                    return mid;
//                }
//            }
//
//
//        return -1;
//    }
    private static int search(int[] arr, int target) {

        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binaryserach(arr,target,start,end);
    }
    private static int binaryserach(int[]arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}