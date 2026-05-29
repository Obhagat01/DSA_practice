package easy;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(ifPrime(num));
        System.out.println(ifPrimeI(num));
    }
    public static boolean ifPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;

            }
        }
        return true;
    }

    // faster version
    public static boolean ifPrimeI(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;

            }
        }
        return true;
    }
}
