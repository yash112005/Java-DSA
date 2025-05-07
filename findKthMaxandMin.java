import java.util.Arrays;
import java.util.Scanner;

public class findKthMaxandMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. find kth max and min element in array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        scanner.close();
        Arrays.sort(arr);
        // Find kth min and max
        if (k > 0 && k <= n) {
            int kthMin = arr[k - 1];
            int kthMax = arr[n - k];
            System.out.println("K-th Minimum element: " + kthMin);
            System.out.println("K-th Maximum element: " + kthMax);
        } else {
            System.out.println("invalid value");
        }

    }
}
