package pattern_printing;
import java.util.Scanner;
public class ultaAlphaNumericTriangle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter:");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for (int j=1;j<=(n+1-i);j++){
                if (i%2==0){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print((char)(i+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
