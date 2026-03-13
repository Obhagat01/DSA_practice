public class OddorEven {
    public static void main(String[] args) {
        int num=69;
        System.out.println(isOdd(num));
    }

    private static boolean isOdd(int num) {
        return (num&1)==1;
    }
}
