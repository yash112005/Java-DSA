import java.util.HashSet;

public class duplicateInAString {
    public static String removeDuplicates(String str) {
        StringBuilder r = new StringBuilder();
        HashSet<Character> s = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (s.add(c)) {
                r.append(c);
            }
        }
        return r.toString();
    }

    public static void main(String[] args) {
        String s1 = "cooling";
        String s2 = removeDuplicates(s1);
        System.out.println(s2);
    }
}

