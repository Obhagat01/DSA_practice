package second.staticExample;
class Test{
    static String name;
    public Test(String name){
        this.name=name;
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Test a=new Test("Kunal");
        Test b=new Test("Rahul");
    }
}
