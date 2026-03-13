package com.ojasvi;

public class OrderAgnosticBS {
    //when we don't know if this is sorted in ascending or descending order
    public static void main(String[] args) {
        int []arr={-18,-12,-4,0,2,3,3,4,15,16,18,22,45,56};
        int target=15;
        System.out.println(orderagnosticBS(arr,target));


    }
    static int orderagnosticBS(int[]arr,int target){
        int start=0;
        int end= arr.length-1;
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

