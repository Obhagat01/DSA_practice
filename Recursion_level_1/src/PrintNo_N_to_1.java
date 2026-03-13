public class PrintNo_N_to_1 {
    public static void main(String[] args) {
        print(5);
    }

    private static void print(int i) {
        if(i==0){
            return;
        }
        System.out.println(i);
        print(i-1);
    }
}
