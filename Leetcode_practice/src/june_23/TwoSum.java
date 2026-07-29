package june_23;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int num[]={2,7,11,15};
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        System.out.println(Arrays.toString(twoSum(num,target)));

    }
    public static int[] twoSum(int []nums,int target){
        if(nums.length==0){
            return new int []{0,0};
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if((nums[i]+nums[j])==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int []{0,0};

    }
}
