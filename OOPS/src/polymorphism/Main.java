package polymorphism;

import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        Shapes sh=new Shapes();
        Circle c=new Circle();
        Sqaure s=new  Sqaure();
        Shapes s1=new Sqaure();

        sh.area();
        c.area();
        s1.area();
    }

}
