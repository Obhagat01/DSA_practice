package infosysPrep.String;

public class ReverseWords {
    public static void main(String[] args) {
        String input="Practice makes a man Perfect";
        System.out.println("Reversed:"+reverseWords(input));
    }
    public static String reverseWords(String input){
        String []words=input.trim().split("\\s+");
        StringBuilder result=new StringBuilder();

        for(int i= words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        return result.toString();
    }

}
