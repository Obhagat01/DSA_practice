public class Count_No_Of_zeros {
    public static void main(String[] args) {
        System.out.println(count(30350001));
    }
    //to count the number of  zeros the in a numbers
    private static int count(int n){
        int c=0;
        return helper(n,c);
    }
    private static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }



}
