public class StringIsSubSequenceOfAnotherString {
    public static boolean Subsequence(String s, String s1) {
        int i = 0, j = 0;

        while (i < s.length() && j < s1.length()) {
            if (s.charAt(i) == s1.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        String s = "abcd";
        String s1 = "aabccdd";

        System.out.println(Subsequence(s, s1));
    }
}

