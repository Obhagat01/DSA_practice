import java.util.ArrayList;
import java.util.List;
//LEETCODE QUESTION NO 448.FIND ALL NUMBERS DISAPPEARED IN ARRAY(GOOGLE QUESTION)
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
class Find_all_num_disappeared_array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int target=nums[i]-1;
            if(nums[i]!=nums[target]){
                swap(nums,i,target);
            }else{
                i++;
            }
        }
        List<Integer>ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;

    }
    void swap(int []arr,int a,int b){
        int temp=arr[b];
        arr[b]=arr[a];
        arr[a]=temp;
    }
}