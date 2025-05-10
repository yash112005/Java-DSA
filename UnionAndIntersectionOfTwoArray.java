import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class UnionAndIntersectionOfTwoArray {
    public static void main(String[] args) {
        int []arr12 = {1,2,3,4,5,6};
        int [] arr13 = {7,8,9,10,11,12,2,3};
        int [] merge = new int[arr12.length +arr13.length];
        for (int i=0;i<arr12.length;i++){
            merge[i] = arr12[i];
        }
        for (int i=0;i<arr13.length;i++){
            merge[arr12.length + i] = arr13[i];
        }
        for(int k:merge){
            System.out.println(k);
        }

        // intersection
        ArrayList<Integer> intersection = new ArrayList<>();

        for (int num1 : arr12) {
            for (int num2 : arr13) {
                if (num1 == num2 && !intersection.contains(num1)) {
                    intersection.add(num1);
                }
            }
        }

        System.out.println("Intersection: " + intersection);



    }
}
