
import java.util.ArrayList;
import java.util.Arrays;

public class LinearSerachArrayList {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,5,8};
        ArrayList<Integer>ans=findAllIndex(arr,4,0,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> findAllIndex(int []arr,int target,int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);

        }
        return findAllIndex(arr,4,index+1,list);
    }
}
