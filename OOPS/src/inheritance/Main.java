package inheritance;

public class Main {
    public static void main(String[] args) {
        Box box=new Box();
        System.out.println(box.l+" "+ box.h+" "+ box.w);

        Box b1=new Box();
        System.out.println(b1.l+" "+ b1.h+" "+ b1.w);

        Box b2=new Box(b1);
        System.out.println(b2.l+" "+ b2.h+" "+ b2.w);

        BoxWeight b3=new BoxWeight(4);
        BoxWeight b4=new BoxWeight(2,3,4,5);
        System.out.println(b4.weight);


        Box b5=new BoxWeight(2,3,5,6);
       // System.out.println(b5.weight); error this is actually the type of reference variable and not the type of object
        //that determines what member can be accessed
        //It is reference type of box & it is referencing to object of type Boxlight

        //BoxWeight b6=new Box(2,3,5);
        //error


        BoxPrice b6=new BoxPrice(5,6,8);

    }
}
