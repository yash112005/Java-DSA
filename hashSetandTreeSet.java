import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.*;
public class hashSetandTreeSet {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>(); // not sorted by default
        h.add("A");
        h.add("B");
        h.add("C");
        h.add("D");
        h.add("a");
        System.out.println(h);

        TreeSet<String> t = new TreeSet<>();

        System.out.println(t);
        t.add("A");
        t.add("B");
        t.add("C");
        t.add("D");
        t.add("a");
        System.out.println(t);


        int []arr={1,2,2,42,4,5,5,3,7,9};
        TreeSet<Integer> t1 = new TreeSet<>();
        for(int n : arr)
            if (t1.contains(n)) {
                System.out.println(n);
            }
        else{
            t1.add(n);
            }










    }
}
