package polymorphism;

public class Numbers {
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    double sum(double a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        Numbers obj=new Numbers();
        obj.sum(3,4);
        obj.sum(3,4,6);
        obj.sum(5.6,7);//even the integer we pass here it will cast it to type double
    }
}
