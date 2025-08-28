package loops;
import java.util.Scanner;
public class displayGP {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms:");
        //1,2,4,8,16....
        int n=sc.nextInt();
        int a=1,r=2;
        for (int i = 0; i <=n; i++) {
            System.out.print(a+" ");
            a *= r;
        }
    }
}
