import java.util.Arrays;

public class DutchNationalFlagProblem {
    public static void sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {

                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {

                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        // 2. Sort an array of 0s, 1s and 2s (Dutch National Flag Problem)
        int []arr4 = {2,0,1,2,1,0,1};
        sortColors(arr4);
        System.out.println(Arrays.toString(arr4));

    }
}
