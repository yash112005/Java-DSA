public class permutationInAString{
    private static void permutation(String s, String permutation) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String remaining = s.substring(0, i) + s.substring(i + 1);
            permutation(remaining, permutation + ch);
        }

        if (s.isEmpty()) {
            System.out.println(permutation);
            return;
        }


    }
    public static void main(String[] args) {
        String s = "toy";
        permutation( s, "");
    }
}

