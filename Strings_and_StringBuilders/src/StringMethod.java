import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name="Ojasvi Bhagat";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println( "   ojasvi   ".strip()); //this will remove the whit spaces
        System.out.println(Arrays.toString(name.split(" ")));

    }
}
