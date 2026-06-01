package easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int nums[]={3,4,6,7,7,8,8,9};
        System.out.println(Arrays.toString(nums));
        removeDuplicates(nums);
        System.out.println();
    }
    public static void removeDuplicates(int nums[]){
        if(nums==null||nums.length==0) {
            return ;
        }
        int j=0;
        for(int i=1;i< nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }

        for(int i=0;i<=j;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static int uniqueElements(int nums[]){
        if(nums==null||nums.length==0) {
            return 0;
        }
        int j=0;
        for(int i=1;i< nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }

        return j+1;
    }
}


