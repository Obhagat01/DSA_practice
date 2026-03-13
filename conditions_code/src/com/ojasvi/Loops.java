package com.ojasvi;

public class Loops  {
    public static void main(String[] args) {
        /*
        for(intialization;condition;increment or decrement){
            //body
        }
         */
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        /*
        initalisation
        while(condition){
            //body
            //increment                use for when you know how many time the loop gonna run and use while when you don't
        }                              ex:- use while when keep taking input till user input x
         */
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }


        /*
        intialisation
        do {
            //body
            //increment
        }while(condition)
         */
        i=1;
        do{
            System.out.println(i);
            i++;
        }while (i<=5);

        //do-while loop will atleast run once as it first run the code and then check for the condtion
        i=1;
        do{
            System.out.println("hello");
        }while(i!=1);
    }
}
