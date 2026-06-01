package easy;


//to find the missing number from (1 to N)
public class MissingNumber {
    public static void main(String[] args) {
        int nums[]={1,2,4,5};
        int n=5;
        System.out.println(missingNumber(nums,n));

    }

    public static int missingNumber(int[]nums,int n){
        int expected=n*(n+1)/2;
        int actual=0;
        for(int x:nums){
            actual+=x;
        }
        return expected-actual;
    }
}
