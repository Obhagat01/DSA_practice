public class PrettyPrinting {
    public static void main(String[] args) {
        float a=453.1234f;
        System.out.printf("Formatted number is %.2f",a);
        System.out.println();
        //This is formatted print statement in java
        //% is placeholder in java
        //%.2f it print upto 2 decimal and it is also rounding it off.

        System.out.println(Math.PI);
        System.out.printf("Pie: %.3f",Math.PI);
        System.out.println();

        System.out.printf("Hello my name is %s and I am %s ","Ojasvi" ,"Cool");
    }
}
