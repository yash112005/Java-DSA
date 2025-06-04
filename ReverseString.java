
import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        String original = "life is full of happiness anf joy";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed: " + reversed);
    }
}


