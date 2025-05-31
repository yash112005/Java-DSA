public class MaxAndMinElementInArray {
    public static void main(String[] args) {
        int[] arr = {1,4,9,10,0};
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Minimum element : " + min + ", Maximum element: " + max);



    }
}





