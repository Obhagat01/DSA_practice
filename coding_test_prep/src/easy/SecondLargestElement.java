package easy;
import java.util.*;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[]={2,4,64,254,21};
        System.out.println(secondLarge(arr));
    }
    public static int secondLarge(int arr[]){
        if(arr==null||arr.length<2){
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                secmax=max;
                max=num;
            }else if(num>secmax && num!=max){
                secmax=num;
            }
        }
        return secmax== Integer.MIN_VALUE?-1:secmax;

    }
}
