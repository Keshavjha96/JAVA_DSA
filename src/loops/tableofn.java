package loops;
import java.util.Scanner;
public class tableofn {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
//        for (int i=n;i<=(n*10);i+=n){
//            System.out.println(i);
//    }
        for (int i=1;i<=(n*10);i++){
            if (i%n==0){
                System.out.println(i);
            }
        }

        int j = 1;
        while (j <= 10) {
            System.out.println(n + " x " + j + " = " + (n * j));
            j++;
        }

    }
}
