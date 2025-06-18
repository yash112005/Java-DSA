import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIQuestion {
    // 1.
    public static List<Integer>evenSqures(List<Integer>n){
        return n.stream()
                .filter(n1 -> n1%2==0)
                .map(n1 -> n1*n1)
                .collect(Collectors.toUnmodifiableList());
    }

    // 2.
    public static List<String>uppercase(List<String>a){
        return a.stream()
                .filter(n1 ->n1.length() > 3)
                .map(n2 ->n2.toUpperCase())
                .collect(Collectors.toUnmodifiableList());
    }


    // 3.
    public static int sum(List<Integer>i){
       Stream<Integer>s = i.stream();
       Stream<Integer>s1 = s.filter(n -> n>0);
       int res = s1.reduce(0,(a,b)->a+b);

       return res;

    }



    public static void main(String[] args) {

        // 1. Given a list of integers, return a list of squares of only even numbers.
        List<Integer> a = Arrays.asList(1,2,3,4,5);
        System.out.println(evenSqures(a));


        // 2. Given a list of names, return a list of names in uppercase which have more than 3 characters.
        List<String>k = Arrays.asList("Ram", "Shyam", "Om", "Sita");
        System.out.println(uppercase(k));


        // 3. Find the sum of all odd numbers in a list.
        List<Integer>i = Arrays.asList(1,2,3,4,5);
        System.out.println(sum(i));


        //4. Convert a list of words to their lengths.
        List<String> words = Arrays.asList("Java", "Stream", "API");
        List<Integer> lengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengths);




    }
}
