package easy;

public class SmallestElement {
    public static void main(String[] args) {
        int arr[]={2,4,6,11,2};
        System.out.println(smallestElement(arr));
    }
    public static int smallestElement(int arr[]){
        if ( arr==null||arr.length==0){
             return -1;
         }
        int min=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        return min;
    }

}
