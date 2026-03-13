package com.assignment_questions;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        String word=input.next();
        //reverse the string
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }

        if(word.equals(reverse)){
            System.out.println("palindrome string");
        }
        else{
            System.out.println("not palindrome string");
        }
    }
}
