import java.util.Arrays;

public class mergeArrayWithoutExtraSpace{
    // Function to merge two sorted arrays without extra space
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = 0, j = 0;

        while (i < n) {
            if (arr1[i] > arr2[j]) {
                // Swap the elements
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;

                // Sort arr2 again (since swapping may disturb order)
                Arrays.sort(arr2);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};

        merge(arr1, arr2);

        System.out.println("Merged Array: " + Arrays.toString(arr1) + " " + Arrays.toString(arr2));
    }
}

