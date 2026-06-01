package easy;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("Nth Fibonacci Term :-"+fibonacciNthTerm(num));
        System.out.print("series:-");
        fibonacciSeries(num);
        sc.close();
    }
    //nth fibonacci series term
    public static int fibonacciNthTerm(int num){
        if(num<=1){
            return num;
        }
        int a=0;
        int b=1;

        for (int i=2;i<=num;i++){
            int next=a+b;
            a=b;
            b=next;
        }
        return b;
    }

    //the code for the fibonacci series
    public static void fibonacciSeries(int num){
        int a =0;
        int b=1;
        for (int i=1;i<=num;i++){
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
}
