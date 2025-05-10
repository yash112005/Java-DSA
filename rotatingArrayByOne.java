import java.util.Arrays;

public class rotatingArrayByOne {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6};
        int n = arr.length;
        int lastelement = arr[n-1];
        for(int i = n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = lastelement;
        System.out.println("rotates array is : "+ Arrays.toString(arr));
    }
}
