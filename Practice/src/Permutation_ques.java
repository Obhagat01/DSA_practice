import java.util.Arrays;

public class Permutation_ques {
    //in= nums[]={0,2,1,5,4,3}
    //out=nums[]={0,1,2,4,5,3}
    //expl=[nums[nums[0]],...nums[nums[4]]

    public static void main(String[] args) {
        int nums[]={0,2,1,5,4,3};
        System.out.println(Arrays.toString(buildarray(nums)));


    }
    public static int[] buildarray(int []nums){
        int []ans= new int[nums.length];
        for(int i:nums){
            ans[i]=nums[nums[i]];
        }
        return ans;
    }
}
