public class StringToint {
    public static void main(String[] args) {
        String s = "56021";

        // Using parseInt()
        int n1 = Integer.parseInt(s);

        // Using valueOf()
        int n2 = Integer.valueOf(s);

        System.out.println("by parseInt() : " + n1);
        System.out.println("by using valueof() : " + n2);



    }
}
