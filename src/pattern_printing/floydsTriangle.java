package pattern_printing;
import java.util.Scanner;
public class floydsTriangle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n=sc.nextInt();
        int a=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(a+" ");
                if (a<10){
                    System.out.print(" ");
                }
                a++;
            }
            System.out.println();
        }
    }
}
