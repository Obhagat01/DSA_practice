package infosysPrep.String;

public class CharacterCouting {
    public static void main(String[] args) {
        String input="hello WORLD 123 @#";
        int []count=countCharacter(input);

        System.out.println("Vowels:"+count[0]);
        System.out.println("Consonants:"+count[1]);
        System.out.println("Digits:"+count[2]);
        System.out.println("Special Characters:"+count[3]);
        System.out.println("Spaces:"+count[4]);
    }
    public static int[]countCharacter(String input){
        int v=0,c=0,d=0,sc=0,s=0;
        for(int i=0;i<input.length();i++){
            char ch=Character.toLowerCase(input.charAt(i));
            if(ch==' '){
                s++;
            }else if(ch>='0'&& ch<='9'){
                d++;
            }else if(ch>='a'&& ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    v++;
                }else{c++;}
            }
            else{
                sc++;
            }
        }
        return new int[]{v,c,d,sc,c};
    }

}
