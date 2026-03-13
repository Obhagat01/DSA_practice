import java.util.ArrayList;
import java.util.List;
//Leetcode question =442
//Also it is Microsoft Question
class Find_all_Duplicate_in_Array {
    public List<Integer> findDuplicates(int[] nums) {
    int i=0;
        
        while(i<nums.length){
            int target=nums[i]-1;
            if(nums[i]!=nums[target]){
                swap(nums,i,target);
            }else{
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
        
    }
    void swap(int []arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
}