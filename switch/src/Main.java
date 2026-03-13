import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //Difference between == and isequalsto
        String a="Ojasvi";
        String b="Ojasvi";
        System.out.println(a==b);  //this will check the reference if both are reference to same value sor not;
        System.out.println(a.equals(b)); // this only check value

        System.out.println("Hello, World!");
    }
}