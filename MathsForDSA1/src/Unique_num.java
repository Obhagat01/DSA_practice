
//this is array question to find the unique number
//in this array each element occurs twice and one element occurs once we have to find that element
public class Unique_num {
    public static void main(String[] args) {
        int []arr={2,3,3,4,2,6,4};
        System.out.println(ans(arr));
    }
//a^a=0
    //a^0=a
    //order doesn't matter a^b^a=(a^a)^b=0^b=b
    private static int ans(int[] arr) {
        int unique=0;
        for(int n:arr){
            unique ^=n;
        }
        return unique;
    }
}
