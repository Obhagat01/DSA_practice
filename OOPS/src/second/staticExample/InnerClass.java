package second.staticExample;
//class Test{
//    static String name;
//    public Test(String name){
//        this.name=name;
//    }
//}
//
//public class InnerClass {
//    public static void main(String[] args) {
//        Test a=new Test("Kunal");
//        Test b=new Test("Rahul");
//        System.out.println(a.name);
//        System.out.println(b.name);
//    }
//}
//
////ouput=Rahul
////      Rahul


public class InnerClass {
    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Test a=new Test("Kunal");
        Test b=new Test("Rahul");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
//now the class test does depend on class but not depend on object of that class
