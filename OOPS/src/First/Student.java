package First;

public class Student {
    int rno;
    String name;
    float marks=90f;

    void greeting(){
        System.out.println("Hello! My name is "+name);
    }

    void changeName(String newName){
        name=newName;
    }
    //we need a way to add the value of above properties obj by obj
    //we need one word to access every object== this keyword

    //Default Constructor
    Student(){
        this.rno=13;
        this.name="Kunal";
        this.marks=88.5f;
    }

    Student(int roll,String name,float marks){
        this.rno=roll;
        this.name=name;
        this.marks=marks;
    }

    Student(Student other){
        this.rno=other.rno;
        this.name=other.name;
        this.marks=other.marks;
    }

    //this is know as the constructor overlaoding

    public static void main(String[] args) {
        Student s1=new Student();
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        s1.greeting();
        s1.changeName("Shoe Lover");
        s1.greeting();

        Student random=new Student(16,"KK",86.67f);
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);


        Student random1=new Student(s1);
        System.out.println(random1.name);
    }

}
