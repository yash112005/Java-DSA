public class SubStringSearch {
    public static void main(String[] args) {
        String s = "interesting book";
        String s1 = "book";
        for(int i=0;i<s.length();i++) {
            int n = 0;
            if (s.contains(s1)) {
                n = s.indexOf(s1);
            }
            System.out.println("starting index is : " + n);
            break;
        }

    }
}
