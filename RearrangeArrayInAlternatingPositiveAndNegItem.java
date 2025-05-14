import java.util.Arrays;

public class RearrangeArrayInAlternatingPositiveAndNegItem {
    public static void main(String[] args) {
        int []arr={-1,4,-8,-9,5,6,-10,3};
        int n = arr.length;
        int []pos = new int[n];
        int []neg = new int[n];
        int posCount = 0,negCount = 0;
        for(int num : arr){
            if(num>=0){
                pos[posCount++] = num;
            }
            else{
                neg[negCount] = num;
            }
        }
        int i=0,j=0,k=0;
        while(i<posCount  && j< negCount){
            arr[k++] = pos[i++];
            arr[k++] = neg[j++];
        }
        while(i<posCount){
            arr[k++] = pos[i++];
        }
        while(j<negCount){
            arr[k++] = neg[j++];
        }
        System.out.println(Arrays.toString(arr));



    }
}
