package pattern_printing;
import java.util.Scanner;
public class number_square {
    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n:");
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){//rows
//            for (int j=1;j<=n;j++){//columns
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){//rows
            for (int j=1;j<=n;j++){//columns
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
