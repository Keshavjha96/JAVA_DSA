package loops;
import java.util.Scanner;
public class highestfactorofsixty {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
//        int n=sc.nextInt();
//        int hf=1;
//        for (int i=1;i<n;i++){
//            if (n%i==0){
//               hf=i;
//            }
//        }
//        System.out.println(hf);
        int n=sc.nextInt();
        int hf=1;
        for (int i=n-1;i>=1;i--){
            if (n%i==0){
                hf=i;
                break;
            }
        }
        System.out.println(hf);
    }
}
