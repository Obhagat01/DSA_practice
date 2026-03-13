package com.ojasvi;

public class SmallestLetter {
    public static void main(String[] args) {
        char []letters={'a','c','j','k'};
        char target='d';
    }
    static int CeilingNUM(int[]arr,int target){
        //Ceiling of a number is the smallest no that is  larger than the target value
        int start=0;
        int end= arr.length-1;
        if(target>arr[end]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target) {
                start = mid + 1;
            }else{
                return mid;
            }

        }
        return start;
    }
}
