package pattern_printing;
import java.util.Scanner;
public class starrectangle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int n=sc.nextInt();
        System.out.println("Enter columns:");
        int m=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
