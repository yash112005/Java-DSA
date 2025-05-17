import java.util.Arrays;

public class SubArrayWithSumUsingTwoPointer{
    public static void findPairs(int[] arr, int target) {
        Arrays.sort(arr); // Sorting required for two-pointer approach
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found: (" + arr[left] + ", " + arr[right] + ")");
                left++;
                right--; // Move both pointers to find other pairs
            } else if (sum < target) {
                left++; // Increase sum
            } else {
                right--; // Decrease sum
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int target = 9;
        findPairs(arr, target);
    }
}

