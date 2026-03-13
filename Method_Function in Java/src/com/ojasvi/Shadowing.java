package com.ojasvi;

public class Shadowing {
    //static=object independent ; why static is used?-- you can't use obj dependent in obj independent thing
    static int x=90;// class variable-- this is shadowed because the lower level is overridden the upper level
    public static void main(String[] args) {
        System.out.println(x);
        int x;
        //System.out.println(x);// error scope will begin when value is initialised
        x=40;//class variable at line 5 is shadowed by this
        System.out.println(x);
        fun();
    }

    private static void fun() {
        System.out.println(x);
    }
}
