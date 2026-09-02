package second.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        Singleton obj1=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();

    }
}
//All 3 reference variable are pointing to just one object
