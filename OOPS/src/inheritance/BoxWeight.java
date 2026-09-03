package inheritance;

public class BoxWeight extends Box{
    double weight;
    BoxWeight(){}

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double h, double l, double w, double weight) {
        super(h, l, w);
        this.weight = weight;
    }

    public BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight= other.weight;
    }
//    //@Override -you can't override a static method
//    public void greeting(){
//        System.out.println("hey!!,I am in BoxWEIGHT Class!!");
//    }


}
