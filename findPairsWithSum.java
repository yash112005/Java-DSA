import java.util.Scanner;
public class findPairsWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int size5 = sc.nextInt();

        int [] arr5 = new int[size5];
        System.out.println("enter target");
        int target = sc.nextInt();
        System.out.println("enter element of array:");
        for(int i=0;i<size5;i++){
            arr5[i] = sc.nextInt();
        }
        System.out.println("pairs are:");
        for(int k=0;k<size5;k++){
            for(int j =k+1;j<size5;j++){
                if(arr5[k]+arr5[j]==target){
                    System.out.println("("+arr5[k]+","+arr5[j]+")");
                }
            }
        }
    }
}
