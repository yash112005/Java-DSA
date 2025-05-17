
public class MissingNofrom1ToN {
    public static int findmissingnumber(int []arr,int n){
        int  sum = n*(n+1)/2;
        int arraysum = 0;
        for(int num : arr){
            arraysum +=num;
        }
        return sum-arraysum;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,5,6};
        int n = 6;
        System.out.println("missing no is : " + findmissingnumber(arr,n));

    }
}
