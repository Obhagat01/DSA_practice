public class Comparison {
    public static void main(String[] args) {
        String a="Kunal";
        String b="Kunal";
        System.out.println(a==b);
        //This two reference variable points to the same oject in pool

        //now if we want create a different objects of same value
        String a1=new String("Kunal");
        String b1=new String("Kunal");
        System.out.println(a1==b1);//false as they don't point to same object in heap
        //this are create outside the pool but inside heap

        //now if we just want to check value and not care about if they points to two different objects in heaps
        System.out.println(a1.equals(b1));//true
    }
}
