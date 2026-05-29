package easy;

import java.util.*;

public class largest_element {
    public static void main(String[] args) {
        int arr[]={2,4,65,21,531,3422};
        System.out.println(max(arr));
    }
    public static int max(int arr[]){


        if(arr.length==0||arr==null){
            return -1;

        }
        int maxi=arr[0]; 

        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }

        return maxi;
    }
}


//public static int max(int[] arr) {
//    if (arr == null || arr.length == 0) {
//        return -1;
//    }
//
//    int max = arr[0];
//    for (int num : arr) {
//        max = Math.max(max, num);
//    }
//
//    return max;
//}