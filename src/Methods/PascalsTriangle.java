package Methods;
import java.util.Scanner;
public class PascalsTriangle {
    public static int fact(int x){
        int xfact=1;
        for (int i=1;i<=x;i++){
            xfact*=i;
        }
        return xfact;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            for (int i=0;i<=n;i++){
                for (int j=1;j<=n-i;j++){
                    System.out.print(" "+" ");
                }
                for (int j=0;j<=i;j++){
                    int icj= fact(i) /(fact(j) * fact(i-j));
                    System.out.print(icj+" "+" "+" ");
                }
                System.out.println();
            }
    }
}
