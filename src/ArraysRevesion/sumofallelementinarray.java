package ArraysRevesion;
import java.util.Scanner;
public class sumofallelementinarray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int i=0;
        while(i<n){
            sum+=arr[i];
            i++;
        }
        System.out.println(sum);
    }
}
