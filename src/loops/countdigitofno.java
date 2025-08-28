package loops;
import java.util.Scanner;
public class countdigitofno {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int count=0;
        if (n==0) count++;
        while (n!=0){
         n/=10;
         count++;
        }
        System.out.println(count);
    }
}
