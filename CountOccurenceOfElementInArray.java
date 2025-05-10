public class CountOccurenceOfElementInArray {
    public static void main(String[] args) {
        int []arr = {1,1,2,3,4,5};
        int target = 1;
        int count = 0;
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("occurance of element is : " + count);
    }
}
