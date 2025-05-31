import java.util.Arrays;
public class ReverseAnArrayInPlace {
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        reverse(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}

