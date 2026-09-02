package inheritance;

public class Box {
    double l,h,w;
    public Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    public Box(double h, double l, double w) {
        this.h = h;
        this.l = l;
        this.w = w;
    }
    //cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box(Box old){
        this.h = old.h;
        this.l =old.l;
        this.w =old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
