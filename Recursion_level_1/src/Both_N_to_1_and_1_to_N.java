public class Both_N_to_1_and_1_to_N {
    public static void main(String[] args) {
        funBoth(5);

    }
    public static void funBoth(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
}
