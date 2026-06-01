package easy;
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s="listen";
        String t="silent";
        System.out.println(isAnagram(s,t));

    }
    // Approach: Frequency count array of size 26.
    // Time: O(n) | Space: O(1)
    public static boolean isAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int x:count){
            if(x!=0){
                return false;
            }
        }
        return true;
    }


    //time :O(nlogn)
    //space: O(n)
    //this is using sorting method


    public static boolean isAnagramI(String s1, String s2) {
            char[] a = s1.toLowerCase().toCharArray();
            char[] b = s2.toLowerCase().toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            return Arrays.equals(a, b);
    }



}
