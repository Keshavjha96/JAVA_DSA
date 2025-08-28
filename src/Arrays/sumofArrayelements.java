package Arrays;
import java.util.Scanner;
public class sumofArrayelements {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array lenght:");
        int n=sc.nextInt();
        System.out.print("Enter Array elements:");
        int[] arr=new int[n];
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
