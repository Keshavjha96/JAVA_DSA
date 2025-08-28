package pattern_printing;
import java.util.Scanner;
public class starultapulta {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int nsp=0,nst=n;
            for (int i=1;i<=n;i++){//lines
                for (int j=1;j<=nsp;j++){//spaces
                    System.out.print("  ");
                }
                for (int j=1;j<=nst;j++){//stars
                    System.out.print("* ");
                }
                nsp+=1;
                nst--;
                System.out.println();
        }
    }
}
