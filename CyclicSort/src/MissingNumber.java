class MissingNumber {
    public int missingNumber(int[] nums) {
        
        cyclicsort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
        
    }
    void cyclicsort(int []arr){
        int i=0;
        int ans=0;
        while(i<arr.length){
            int correct=arr[i];
            
                 if((arr[i]<arr.length)&&(arr[i]!=arr[correct])){
                    swap(arr,i,correct);
                }else{
                    i++;
                }
           
        }
    }
    void swap(int []arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}