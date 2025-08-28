package pattern_printing;
import java.util.Scanner;
public class StarTriangle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        //STAR TRIANGLE
        System.out.println("Enter:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //number TRiangle
//        System.out.println("Enter:");
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
        //ALPHABET TRIANGLE
//        System.out.println("Enter:");
//        int n=sc.nextInt();
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print((char)(j+64)+" ");
//            }
//            System.out.println();
//    }
    }
}

