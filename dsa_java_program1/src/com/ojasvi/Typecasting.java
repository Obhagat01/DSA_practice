package com.ojasvi;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float num=input.nextFloat();
        System.out.println(num);// if we even give input as int it will give the output in float
        //1.for conversion  both types should be compitable like int ,float
        //2.the destination type should be greater than the source type


        // how about now integer to float?
        //type casting or narrow conversion
        int num1=(int)(576.099f);

        //authomatic type promotion in expression
        int a =257;
        byte b=(byte) (a);
        System.out.println(b); //here output is 1 because 357 is out of range of byte(256) then it do the
                                // remainder of number with it max value that is 257%256=1

        byte a1=40;
        byte b1=50;
        byte c=100;
        int d=(a1*b1)/ c;           //here result of the intermediate term a1*b1 easily exceed the range of byte
                                    // operator to handle this kind of problem  java automatically is promoting the each
                                    //byte to int when evaluating this expression is performed using bytes not integers.

        System.out.println(d);

        byte b2=50;
        //b=b*2 this is error as (b*2) is automatically converted to int then how it can be store in byte

        int number='A';
        System.out.println(number); // this return ascii code

        // java follows a unicode principle
        System.out.println("नमस्ते");



        // Rules of type conversion
        // 1. all the byte short and char values are promoted to int then any operand is long whole expression is promoted
        // to long if float whole expression is promoted to float same for double

        System.out.println(4*5.6);
        System.out.println(56*475674.89684f);

        // example to review concepts
        byte b3=43;
        char c1='a';
        short s=1024;
        int i=5000;
        float f= 5.67f;
        double d1=0.123234;
        double result=(f*b3)+(i/c)-(d*s);
        //float+int+double
        System.out.println((f*b3)+" "+(i/c)+" "+(d*s));
        System.out.println(result);


    }
}
