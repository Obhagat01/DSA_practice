package First;

public class FinalEx {
    //this can't be modified
    final int INCREASE=2;

    //Immutability is only holding true for the primitive datatype

    public static void main(String[] args) {
        final A kunal= new A("KK");
        kunal.name="other name";
       // kunal=new A("new object");             error we can't reassign  it

    }

}

class A{
    //final int num;  this will give error as it is no initialized
    //final keyword need to be intialized
    final int num=2;
    String name;

    public A(String name) {
        this.name = name;
    }
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("object is destroyed");
//    }
}

