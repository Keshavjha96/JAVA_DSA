package Arrays;
import java.util.Scanner;
public class printnegative {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter elements of array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if (arr[i]<0)
            System.out.print(arr[i]+" ");
        }
    }
}
