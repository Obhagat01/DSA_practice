package com.ojasvi;
public class LinearSearch {
    public static void main(String[] args) {
        //search in the array return the index if found
        //else return -1 if not found
        int []arr={1,24,45,343,-34,0,-1,56};
        int target=-1;
        System.out.println(Linear_Search(arr,target));
        System.out.println(Linear_Search1(arr,target));
        System.out.println(Linear_Search2(arr,target));


    }

    private static boolean Linear_Search2(int[] arr, int target) {
        if(arr.length==0){
            return false;
        }

        //to find the index at which the element if found
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return true;
            }
            //this will execute when the target is not found at any index
        }
        return false ;
    }

    static int Linear_Search(int []arr,int target){
        //if length of array =0 i.e array equal to null
        if(arr.length==0){
            return -1;
        }

        //to find the index at which the element if found
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
            //this will execute when the target is not found at any index
        }
        return -1;
    }

    static int Linear_Search1(int []arr,int target) {
        //in this we are returning the element itself
        //if length of array =0 i.e array equal to null
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        //to find the index at which the element if found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
            //this will execute when the target is not found at any index
        }
        //Integer.MAX_VALUE is used because in this we are returning the element and the element can also be -1 hence this
        return Integer.MAX_VALUE;
    }
}
