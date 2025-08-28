package Arrays;
import java.util.Scanner;
public class sumofarrays {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array:");
        int n=sc.nextInt();
        System.out.println("Enter elements of array:");
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
