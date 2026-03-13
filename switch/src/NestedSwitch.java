import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int empId= in.nextInt();
        String dept=in.next();

        switch(empId){
            case 1:
                System.out.println("Ojasvi bhagat");
                break;
            case 2:
                System.out.println("Kunal Kushwaha");
                break;
            case 3:
                System.out.println("Deparment for empId=3");
                switch (dept){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department ..");
                }
                break;
            default:
                System.out.println("enter the valid empId");
        }
    }
}
