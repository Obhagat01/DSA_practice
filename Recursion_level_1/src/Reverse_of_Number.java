public class Reverse_of_Number {
    public static void main(String[] args) {
        rev1(4531);
        System.out.println(sum);
        System.out.println(rev2(4567));
    }
    //method of reversing a  number using recursion with the help of static variable
    static int sum=0;
    private static void rev1(int n){
        if(n==0){
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
    }
//This is method 2 of reversing a number using the helper function
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
