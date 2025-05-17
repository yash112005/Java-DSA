public class checkIfArrayIsSortedAndRotated {
    public static boolean isSorted(int[] arr,int n) {
        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static boolean isRotated(int []arr,int n){
       int left = 0;
       int right = n-1;
        if(arr[left]<arr[right]){
            return false;
        }
       while(left<=right){
           int mid = (left+right)/2;

           if(mid>0 && arr[mid]<arr[mid-1]){
               return true;
           } else if (arr[mid]>=arr[left]) {
               left = mid+1;
           }
           else{
               right = mid;
           }
       }
       return false;

    }
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int n = arr.length;
        System.out.println("check sorting (true or false) : " + isSorted(arr,n));
        System.out.println("check rotation (true or false) : " + isRotated(arr,n));

    }
}
