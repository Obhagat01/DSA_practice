package infosysPrep.String;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";

        boolean result=isAnagram(s1,s2);
        System.out.println("Are Anagrams:"+result);
    }

    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        int []freq=new int[256];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)]++;
            freq[s2.charAt(i)]--;

        }
        for(int i=0;i<s1.length();i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
