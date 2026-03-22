public class ArrayIsSorted {
    public static void main(String[] args) {
        int []arr={3,5,7,8,5,9};
        System.out.println(ifSorted(arr,0));
    }
    //To find if the elements in the array are sorted or not
    private static boolean ifSorted(int[] arr, int index) {
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && ifSorted(arr,index+1);
    }
}
