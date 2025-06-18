import java.util.*;
import java.util.HashMap;
public class LongestSubStringWithoutRepeatingChar {
    public static String findLongestSubstring(String s) {
        HashMap<Character, Integer> seen = new HashMap<>();
        int start = 0, maxLen = 0, maxStart = 0;

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);
            if (seen.containsKey(current) && seen.get(current) >= start) {
                start = seen.get(current) + 1;
            }
            seen.put(current, end);
            if (end - start + 1 > maxLen) {
                maxLen = end - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLen);
    }

    public static void main(String[] args) {
        String i = "vacation";
        String r = findLongestSubstring(i);
        System.out.println("Longest substring is : " + r);
    }
}

