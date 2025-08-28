package loops;
import java.util.Scanner;
public class multiplicationofdigits {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int product=1;
        while (n!=0){
            int lastdigit=n%10;
            product*=lastdigit;
            n/=10;
        }

        System.out.println(product);
    }
}
