package com.ojasvi;
//This is LEETCODE QUESTION 1095.FIND IN MOUNTAIN ARRAY NEED TO BE SUBMITTED AFTER COMPLETING OOPS
public class FindinMountainArray {
    public static void main(String[] args) {
        int []arr={2,3,4,5,6,3,2};
        int target=3;
        System.out.println(FindInMountainARR(arr,target));
    }
    static int FindInMountainARR(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        int peak=peakelement(arr);
        int ans=orderagnosticBS(arr, target,start,peak);
        if(ans==-1){
            ans=orderagnosticBS(arr,target,peak+1,end);
        }
        return ans;
    }
    static int peakelement(int []arr){
            int start=0;
            int end=arr.length-1;

            while(start<end){

                int mid=start+(end-start)/2;
                if(arr[mid]<arr[mid+1]){
                    start=mid+1;
                }
                else{
                    end=mid;
                }
            }
            return start;

        }


    static int orderagnosticBS(int[]arr,int target,int start,int end){

        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }else{
                if(arr[mid]<target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}
