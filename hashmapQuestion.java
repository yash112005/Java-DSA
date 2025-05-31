import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class hashmapQuestion {
    public static void main(String[] args) {
        String s = "programming";
        HashMap<Character, Integer> h = new HashMap<>();
        for(char c: s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        System.out.println(h);



        String s1 = "programming is a fun and fun is a programming";
        String[] words = s1.split(" ");
        HashMap<String, Integer> h = new HashMap<>();
        for (String word : words) {
            h.put(word, h.getOrDefault(word, 0) + 1);
        }
        System.out.println(h);


        String s = "aaabcccdddeeef";
        HashMap<Character, Integer> h = new HashMap<>();
        for(char c: s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);

        }
        int min_Freq = Collections.min(h.values());
        System.out.print("least frequency char : ");
        for (Map.Entry<Character, Integer> entry : h.entrySet()) {
            if (entry.getValue() == min_Freq) {
                System.out.print(entry.getKey() + " ");
            }
        }








    }
}
