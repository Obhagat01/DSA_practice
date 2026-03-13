import java.util.ArrayList;

public class StringConcatenationOperator {
    public static void main(String[] args) {
        System.out.println('a' + 'b');//it convert it into the ascii or unicode and add it
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);
        //When String is concatenated(means added with string) it is converted to Wrapper class and then it's call the toString() method
        //It will be same as "a"+"1"

        System.out.println("Kunal"+new ArrayList<>());//this Arraylist will also called the toString method
        System.out.println("Kunal"+new Integer(56));
        //System.out.println(new Integer(56)+new ArrayList<>());
        //this is error beacuse this is wntire expressio..
        //+ in java :and in java you can only use it with primitive and with complex object but there is only one condition one of the
        //the object should be of type string
        System.out.println(new Integer(56)+""+new ArrayList<>());
    }
}
