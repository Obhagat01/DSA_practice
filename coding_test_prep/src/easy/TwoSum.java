package easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[]={3,5,6,7,1};
        int target=13;
        int ans[]=twoSumI(nums,target);
        System.out.println(Arrays.toString(ans));

    }
    //Brute Force Approach
    // time complexity=O(n^2)
    //space complexity=O(1)
    public static int []twoSum(int []nums,int target){

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int []{-1,-1};
    }

    //Optimal Approach -using hashmap
    //time complexity=O(n)
    public static int []twoSumI(int []nums,int target){
        HashMap <Integer,Integer>map=new HashMap<>();
        for(int i=0;i< nums.length;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
