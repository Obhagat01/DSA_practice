public class Product_of_Digits {
    public static void main(String[] args) {
        //to find the product of a digits of the number
        System.out.println(prod(5632));
    }

    private static int prod(int n) {
        if(n%10==n){
            return n;
        }
        return (n%10)*prod(n/10);
    }
}
