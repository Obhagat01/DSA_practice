package infosysPrep.String;



//to check if the string is palindrome (ignore case/spaces/punctuation)
//approach:- to clean the string and keep only letter and the digit and then using the two pointer
//Time:0(n) and Space 0(n)
public class ReverseString{
    public static void main(String[] args) {
        String input="A man,a plan,a cancel:Panama";
        System.out.println("Reversed String:"+reverseString(input));
        System.out.println("Reversed String:"+reverseString1(input));
    }

    public static String reverseString(String input){

        String s="";
        for(int i=input.length()-1;i>=0;i--){
            s=s+input.charAt(i);
        }
        return s;

    }

    //second method
    public static String reverseString1(String input){
        String reverse=new StringBuilder(input).reverse().toString();
        return reverse;

    }
}
