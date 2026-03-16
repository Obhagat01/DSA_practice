public class sum_of_num {
    public static void main(String[] args) {
        //sum of numbers from 5 to 1
        System.out.println(sum(5));
    }

    private static int sum(int n) {
        if(n<=1){
            return 1;
        }
        return n+sum(n-1);
    }
}
