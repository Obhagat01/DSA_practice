package infosysPrep.String;

public class RemoveDuplicatesInString {
    public static void main(String[] args) {
        String input="programming";
        System.out.println("Original:"+input);
        System.out.println("After removing Duplicates:"+removeDuplicates(input));

    }
    public static String removeDuplicates(String input){
        boolean[] seen=new boolean[256];
        StringBuilder result=new StringBuilder();

        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(!seen[ch]){
                seen[ch]=true;
                result.append(ch);
            }
        }
        return result.toString();
    }
}
