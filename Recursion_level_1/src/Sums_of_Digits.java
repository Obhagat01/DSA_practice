public class Sums_of_Digits {
    public static void main(String[] args) {
        //sum of digits of a number
        System.out.println(sum(2345));
    }

    private static int sum(int n) {
        if(n==0){
            return 0;
        }
        return (n%10)+sum(n/10);
    }
}
