package com.ojasvi;

public class MaximumValue {
    public static void main(String[] args) {
        int[]arr={34,45,32,232,54};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,1,4));
    }
    static int max(int []arr){
        if (arr.length==0){
            return -1;
        }
        int maxval=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    static int maxrange(int []arr,int start,int end){
        if(end<start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int maxval=arr[start];
        for(int i=start+1;i<end;i++){
            if(maxval>arr[i]){
                    maxval=arr[i];
            }
        }
        return maxval;
    }
}
