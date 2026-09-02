package First;

public class WrapperExample {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        Integer num1=30;
        Integer num2=10;
        //this will not swap
        swap(a,b);
        System.out.println(a+" "+b);
        //When we do it for integer object still it will not swap;
        swap(num1,num2);
        System.out.println(num1+" "+num2);

    }

    private static void swap(Integer num1, Integer num2) {
        Integer temp=num1;
        num1=num2;
        num2=temp;
    }

//    private static void swap(int a, int b) {
//        int temp=a;
//        a=b;
//        b=temp;
//    }

}
