package second.Singleton;

public class Singleton {
    //when the only one instance or object is allowed
    private Singleton(){

    }
    private static Singleton instance;

    public static Singleton getInstance() {
        //check whethe one object is created or not
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }
}
