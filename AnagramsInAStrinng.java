import java.util.Arrays;

public class AnagramsInAStrinng {
    public static boolean anagram(String s,String s1){
        if(s.length() != s1.length()){
            return false;
        }
        char []arr = s.toCharArray();
        char []arr1 = s1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        return  Arrays.equals(arr,arr1);
    }
    public static void main(String[] args) {
        String s = "listen";
        String s1 = "silent";
        if(anagram(s,s1)){
            System.out.println("String is anagram");
        }
        else{
            System.out.println("String is not anagram");
        }

    }
}
