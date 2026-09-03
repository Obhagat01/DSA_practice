package polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint(5);
        //System.out.println(obj);//polymorphism.ObjectPrint@7b23ec81 this is output when toString is not written
        System.out.println(obj);
    }
}
