package infosysPrep.String;



//to check if the string is palindrome (ignore case/spaces/punctuation)
//approach:- to clean the string and keep only letter and the digit and then using the two pointer
//Time:0(n) and Space 0(n)
public class PalindromeString {
    public static void main(String[] args) {
        String input="A man,a plan,a cancel:Panama";
        System.out.println("is Palindrome:"+isPalindrome(input));
    }

    public static boolean isPalindrome(String input){
        StringBuilder cleaned=new StringBuilder();
        for(int i=0;i<input.length();i++){
            char c=input.charAt(i);
            if(Character.isLetterOrDigit(i)){
                cleaned.append(Character.toLowerCase(c));
            }

        }
        String s= cleaned.toString();
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
