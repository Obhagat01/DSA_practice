public class No_OF_Steps_to_reduceTo_zero {
    public static void main(String[] args) {
        System.out.println(no_of_Steps(41));
    }
    //leetcode question -1342 https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
    public static int no_of_Steps(int n){
        return helper(n,0);
    }
    public static int helper(int num,int steps){
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return helper(num/2,steps+1);
        }
        return helper(num-1,steps+1);
    }
}

