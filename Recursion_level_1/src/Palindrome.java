public class Palindrome {
    public static void main(String[] args) {
        System.out.println(ifPalindrome(4554));
    }

    private static boolean ifPalindrome(int n) {
        if(n==rev2(n)){
            return true;
        }
        return false;
    }

    private static int rev2(int n) {
        int digits=(int)(Math.log10(n))+1; //to find the number of digits this is used.
        return helper(n,digits);
    }
    private static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }
}
