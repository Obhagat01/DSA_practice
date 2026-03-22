public class LinearSearchRecursion {
    public static void main(String[] args) {
        int []arr={4,7,87,23,11,34};
        System.out.println(find(arr,78,0));
        System.out.println(findIndex(arr,23,0));
    }
    //boolean method to find if element is present in arr or not
    public static boolean find(int []arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target||find(arr,target,index+1);
    }
    //to find at which index the target element is present and if not it return -1
    public static int findIndex(int []arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }

}
