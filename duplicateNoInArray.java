import java.util.Arrays;

public class duplicateNoInArray {
    public static void main(String[] args) {
        int []arr = {1,2,2,1,3,3,4,5};
        int n = arr.length-1;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(arr[i]==arr[i+1]){
                System.out.println("duplicate element found : " + arr[i]);
            }

        }

    }
}
