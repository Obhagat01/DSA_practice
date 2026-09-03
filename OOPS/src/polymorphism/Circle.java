package polymorphism;

public class Circle extends Shapes{
    //this will run when object of circle is created
    //hence it is overriding the parent method
    @Override //this is called annotation to check whether the method is overridden or not
    void area(){
        System.out.println("The area is pie*2*r");
    }
}
