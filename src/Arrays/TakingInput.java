package Arrays;
import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n=sc.nextInt();
        System.out.print("Enter Array elements:");
        int[] arr=new int[n];
//        input
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Output
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
