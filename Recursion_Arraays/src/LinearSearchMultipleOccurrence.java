import java.util.ArrayList;

public class LinearSearchMultipleOccurrence {
    public static void main(String[] args) {
        int []arr={2,3,4,4,5};
        int target=4;
        //this for the first way
        findAllIndex(arr,target,0);
        System.out.println(list);

        //for the second way
        ArrayList<Integer>ans=new ArrayList<>();
        ans=findAllIndex1(arr,target,0,ans);
        System.out.println(ans);

        //this for the 3rd way
        System.out.println(findAllIndex3(arr,target,0));

    }
    //this is the first way using the static list
    static ArrayList<Integer> list=new ArrayList<>();
    private static void findAllIndex(int[] arr, int target, int index) {
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);


    }

    // now the second way to return the arraylist
    static ArrayList<Integer> findAllIndex1(int[] arr,int target,int index,ArrayList<Integer>ans){
        if (index== arr.length){
            return ans;
        }
        if (arr[index]==target){
            ans.add(index);
        }
        return findAllIndex1(arr,target,index+1,ans);
    }


    //third approach is  to return the list without passing the argument ,this is not much optimise
    static ArrayList<Integer> findAllIndex3(int[]arr,int target,int index){
        ArrayList<Integer> list1=new ArrayList<>();
        if(index==arr.length){
            return list1;

        }
        if(arr[index]==target){
            list1.add(index);            // this will store the answer for the individual function call only
        }
        ArrayList<Integer> ansFromBelowCalls=findAllIndex3(arr,target,index+1);
        list1.addAll(ansFromBelowCalls);//this will add the answer from the each function call
        return list1;
    }

}
