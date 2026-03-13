package com.ojasvi;

import java.util.Scanner;

public class StringReturn {
    public static void main(String[] args) {
        String message=greet();
        System.out.println(message);

        Scanner in=new Scanner(System.in);
        String name= in.nextLine();
        String message1 =greet2(name);
        System.out.println(message1);

    }
    static String greet(){
        String greeting="how are you?";
        return greeting;
    }
    static String greet2(String naam){
        String greeting="hello "+naam;
        return greeting;
    }
}
