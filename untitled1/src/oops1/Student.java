package oops1;

import java.util.Arrays;

public class Student {
    public static void main(String[] args) {
        Student1[]  s1=new Student1[5];
        System.out.println(Arrays.toString(s1));
    }
}

class Student1{
    int rno;
    String name;
    int marks;
}
