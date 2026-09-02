package second.staticExample;

//When the member is declared as static it can be accessed before any of the object been created
//& without referncing to that object

public class Main {
    public static void main(String[] args) {
        Human a=new Human(22,"AA",100000,false);
        Human b=new Human(34,"BB",20000,true);
        System.out.println(Human.population);
        System.out.println(Human.population);
    }





    //this(static method) is not dependent on object
    static void fun(){
        //greeting;//you can't use this because it requires an instance(object) but the fun you
                 //are using it does not depend on instance

        //you can't access non static stuff wihtout referencing their instance in a static context
        //hence here i am referncing it
        Main obj=new Main();
        obj.greeting();
    }
    //we know something that is not static depen to object
    void greeting(){}
}
