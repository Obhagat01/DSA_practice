package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int nums[]={2,0,4,0,0,78};
        moveZeros(nums);
    }

    // Approach: Two-pointer — keep a "write pointer" for non-zero elements.
    // Time: O(n) | Space: O(1)
    public static void moveZeros(int nums[]){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        while(j<nums.length){
            nums[j++]=0;
        }
        System.out.println(Arrays.toString(nums));
    }

}
