package easy;
import java.util.Scanner;

public class CountStep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int totalcount=0;
        if(n<1){
            System.out.println("invalid Input");
        }
        if(n==1){
            totalcount++;
            System.out.println(totalcount);
        }
        while(n>1){
            if(n%2==0){
                n=n/2;
                totalcount++;
                if(n==1){
                    System.out.println(totalcount);
                }
            }
            else{
                n=n*3+1;
                totalcount++;
            }
        }
    }
}
