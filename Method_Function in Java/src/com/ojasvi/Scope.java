package com.ojasvi;

public class Scope {
//    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        System.out.println(a);
//        //System.out.println(marks);  --error
//    }
//    static void random(int marks){
//        int num=67;
//        System.out.println(num);
//        System.out.println(marks);
//    }
//}

    //Block Scope
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            a=78;   //-- you can't initialise the same reference variable but you can change it
                    //--reassign the original reference variable to some other value
            int c=45;
        }
        //System.out.println(c); this is error as c is initialise inside the block

        String name="Kunal";
        {
            name="Rahul";
        }
        System.out.println(name); //output will be Rahul

        //LOOP SCOPE
        for(int i=0;i<4;i++){
            System.out.println(i);
            int num=90;
            //int a=10; --error already defined in scope

        }
        //System.out.println(i); --error outside the loop
    }
}

/* ANYTHING INITIALISED OUTSIDE THE BLOCK CAN BE USED INSIDE THE BLOCK ,BUT ANYTHING INITIALISED
 * INSIDE THE BLOCK CAN'T BE USED OUTSIDE .
 *
 * ANYTHING THAT IS INITIALISED OUTSIDE CAN'T BE INITIALISED INSIDE THE BLOCK ,BUT ANYTHING THAT IS INITIALISDE
 * INSIDE THE BLOCK CAN BE INITIALISED OUTSIDE THE BLOCK.
 */