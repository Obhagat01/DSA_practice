package easy;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        System.out.println(checkPalindrome(word));
    }

    public static boolean checkPalindrome(String word){
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse+=word.charAt(i);

        }
          return word.equals(reverse);


    }

    // using the string builder method
    // time and space complexity= O(n)
    public static boolean checkPalindromeII(String word){
        String reverse=new StringBuilder(word).reverse().toString();
        return word.equals(reverse);
    }

    // using the 2-pointer method
    //time complexity=O(n)
    //Space complexity=0(1)
    //this is the most optimal method
    public static boolean checkPalindromeIII(String word){
        int left=0;
        int right=word.length()-1;
        while(left<right){
            if(word.charAt(left)!=word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
