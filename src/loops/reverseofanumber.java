package loops;
import java.util.Scanner;
public class reverseofanumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int rev=0;
        while (n!=0){
            int lastdigit=n%10;
            rev*=10;
            rev+=lastdigit;
            n/=10;
        }
        System.out.println(rev);
    }
}
