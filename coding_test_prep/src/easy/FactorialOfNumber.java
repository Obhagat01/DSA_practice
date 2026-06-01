package easy;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(5));
        System.out.println(factorialI(5));


    }

    //using the recurssion
    //time and space=O(n)  because of recursive call stack)
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n*factorial(n-1);
    }

    //this is using the iteration
    //time=O(n)
    //space=O(1)
    public static long factorialI(int n){
        if(n<1){
            return 0;
        }
        long fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

}
