package pattern_printing;
import java.util.Scanner;
public class oddNumbertriangle {
    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//        System.out.println("Enter:");
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++) {
//                System.out.print((2*j-1)+" ");
//            }
//            System.out.println();
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int a=1;
            for (int j=1;j<=i;j++) {
                System.out.print(a+" ");
                a +=2;
            }
            System.out.println();
        }
    }
}
