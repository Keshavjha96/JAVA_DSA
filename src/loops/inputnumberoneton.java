package loops;
import java.util.Scanner;
public class inputnumberoneton {
    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n:");
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            System.out.println(i);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        for (int i = b; i <= n; i++) {
            System.out.println(i);
        }
    }
}
