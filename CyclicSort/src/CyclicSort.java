import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
      int []arr={3,5,2,1,4};
      Cylicsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void Cylicsort(int[]arr){
        int i=0;
        while( i<arr.length){
           int correct=arr[i]-1;
           if(arr[i]!=arr[correct]){
               swap(arr,i,correct);
           }else{
               i++;
           }
        }
    }
    static void swap(int []arr,int a,int b ){
        int temp=arr[b];
       arr [b]=arr[a];
        arr[a]=temp;
    }
}