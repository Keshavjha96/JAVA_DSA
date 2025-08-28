package Arrays;
import java.util.Scanner;
public class Linearsearch {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n=sc.nextInt();
        System.out.println("Enter Array elements:");
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
        int x=5;
        boolean flag=false; //nahi mila
        for (int i=0;i<n;i++){
            if (arr[i]==5){
                flag=true;
                break;
            }
        }
        if (flag==false){
            System.out.println("Nahi Mila");
        }
        else {
            System.out.println("Mil Gya");
        }
        }
}

