package com.ojasvi;

public class SearchInRange {
    public static void main(String[] args) {
        int []arr={34,65,78,43,13,14,23,43,435};
        int target =13;
        int start=1;
        int end=6;
        System.out.println(search(arr,target,start,end));
    }

    private static int search(int[] arr, int target, int start, int end) {
        //if length of array =0 i.e array equal to null
        if(arr.length==0){
            return -1;
        }

        //to find the index at which the element if found
        for(int i=start;i< end;i++){
            if(arr[i]==target){
                return i;
            }
            //this will execute when the target is not found at any index
        }
        return -1;
    }
}
