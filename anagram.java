import java.util.Arrays;
public class anagram {
    public static boolean isAnagram(String s1,String s2){
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] s1Array=s1.toCharArray();
        char[] s2Array=s2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        return Arrays.equals(s1Array,s2Array);
    }
    public static void main(String[] args){
        String s1="listen";
        String s2="silent";
        if(isAnagram(s1,s2)){
            System.out.println("The strings are anagrams");
        }
        else{
            System.out.println("The strings are not anagrams");
        }
    }
}   
