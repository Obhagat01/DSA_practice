package second.staticExample;

public class StaticBlcok {
    static int a=4;
    static int b;

    //will only run once,when fist object is created u.e when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlcok obj1=new StaticBlcok();
        System.out.println(StaticBlcok.a+" "+StaticBlcok.b);

        StaticBlcok.b+=3;
        System.out.println(StaticBlcok.a+" "+StaticBlcok.b);

        StaticBlcok obj2=new StaticBlcok();

        System.out.println(StaticBlcok.a+" "+StaticBlcok.b);


    }
}
