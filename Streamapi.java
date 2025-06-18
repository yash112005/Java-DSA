import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Streamapi {
    public static void main(String[] args) {
        // 1. stream api is a interface which provide methods which make work easier
        // 2. stream api won't affect the original array or data
        // 3. stream api is use only ones
        // 4. to have new stream api you have to create new stream
        // 5. if give facilty to write code in one line

        List<Integer>n = Arrays.asList(1,2,3,4,5);

        Stream<Integer>s = n.stream();

        Stream<Integer>s1 = s.filter(n1 -> n1 %2==0);

        Stream<Integer>s2  =s1.map(n2 -> n2*n2);

        int result = s2.reduce(0,(a,b)-> a+b);

        System.out.println(result);

        s2.forEach(n1 -> System.out.println(n1));


        // another way of writing
        n.stream()
                .filter(n1 -> n1 %2==0)
                .map(n2 ->n2*n2)
                .reduce(0,(a,b)-> a+b);

    }
}
