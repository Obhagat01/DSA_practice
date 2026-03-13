package com.ojasvi;
public class Conditions {
    public static void main(String[] args) {

        /*
        if(boolean expression True or False){
            //body
        }else{
            //do this
        }
         */
        int sal=45000;
        if(sal>40000){
            sal+=3000;
        }
        else{
            sal+=6000;
        }
        System.out.println(sal);

        /*
        multiple if-else
        if(condition){
            do this
        }if else(conditon){
            do this
        }
        else{
            //do this
        }
         */

        if(sal>60000){
            sal-=7000;
        }else if(sal>40000){
            sal+=9000;
        }else {
            sal+=90000;
        }
        System.out.println(sal);
    }
}