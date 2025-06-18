import java.util.*;

public class RotationOfString {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        String concatenated = s1 + s1;
        return concatenated.contains(s2);
    }

    public static void main(String[] args) {
        String s = "hello";
        String s1 = "ohell";
        if (isRotation(s, s1)) {
            System.out.println("String is rotation of another string");
        } else {
            System.out.println("String is not rotation of another string");
        }
    }
}

