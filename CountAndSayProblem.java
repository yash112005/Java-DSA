public class CountAndSayProblem {
    public static String countAndSay(int n) {
        String result = "1";

        for (int i = 1; i < n; i++) {
            result = build(result);
        }

        return result;
    }

    private static String build(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                sb.append(count).append(s.charAt(i - 1));
                count = 1;
            }
        }

        sb.append(count).append(s.charAt(s.length() - 1));
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countAndSay(n));
    }
}

