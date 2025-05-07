
import java.util.Arrays;
import java.util.Scanner;
public class postiveAndNegativeNoSort {
    public static void sortnumber(int[] num) {
        int left = 0, right = num.length - 1;

        while (left <= right) {
            if (num[left] < 0) {
                left++;
            } else if (num[right] >= 0) {
                right--;
            } else {
                int temp = num[left];
                num[left] = num[right];
                num[right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        // 3. Move all negative numbers to beginning and positive to end

        int []num = {1,2,-1,3,-4,6,-2};
        sortnumber(num);
        System.out.println(Arrays.toString(num));
    }
}
