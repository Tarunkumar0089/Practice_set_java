import java.util.Arrays;

public class valid_anagram {
    public static void main(String[] args) {
        String  s = "anagram";
        String t = "nagaram";
        char[] ch=t.toCharArray();
        Arrays.sort(ch);
        String str=ch.toString();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=str.charAt(i)){
                 System.out.println("false");
                 break;
            }
        }
        System.out.println("true");
    }
}
