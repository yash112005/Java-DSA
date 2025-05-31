import java.util.ArrayList;
import java.util.LinkedList;
import java.util.jar.JarOutputStream;

public class arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.add(i);
        }
        System.out.println(arr);

        LinkedList<Integer> arr1  = new LinkedList<>();
        long start = System.nanoTime();
        for(int i=0;i<10;i++){
            arr1.add(i);
        }
        
        System.out.println(arr1);
        System.out.println(arr1);
        arr1.clone();
        System.out.println(arr1);

        System.out.println(arr1);

        System.out.println(arr1.size());

        arr1.add(0,6);
        System.out.println(arr1);

        System.out.println(arr.contains(5));

        long end = System.nanoTime();
        System.out.println(end-start);
    }
}
