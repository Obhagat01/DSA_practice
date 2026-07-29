package infosysPrep.String;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input="swiss";
        char result=firstNonRepeatingChar(input);
        if(result!='\0'){
            System.out.println("first Non Repeating Char is :"+result);
        }
        else{
            System.out.println("no first Non Repeating Char");
        }
    }
    public static char firstNonRepeatingChar(String input){
        int []freq=new int[256];
        for(int i=0;i<input.length();i++){
            freq[input.charAt(i)]++;
        }
        for(int i=0;i<input.length();i++){
            if(freq[input.charAt(i)]==1){
                return input.charAt(i);
            }
        }
        return '\0';
    }
}
