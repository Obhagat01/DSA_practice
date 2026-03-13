public class Main {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println();
        System.out.println();
        pattern2(5);
        System.out.println();
        System.out.println();
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern5A(5);
        pattern28(5);
    }
    static void pattern1(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static  void pattern2(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row=1;row<=n;row++){

            for(int col=1;col<=row;col++){
                System.out.print(col+" ");

            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int j=2*n-1;j>=i;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }

    static void pattern5A(int n){
        for(int i=0;i<2*n-1;i++){
            int totalnocol=i>n ? 2*n-i:i;
            for(int j=0;j<totalnocol;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern28(int n){
        for(int i=1;i<=2*n-1;i++){
            if(i<=n){
                for(int j=n-1;j>=1;j--){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }else{
                for(int j=2*n-1;j>=i;j--){
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}