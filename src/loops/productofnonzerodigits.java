package loops;
import java.util.Scanner;
public class productofnonzerodigits {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int product = 1;
        boolean flag = false;//hasNonZeroDigit
        while (n != 0) {
            int digit = n % 10;
            if (digit != 0) {
                product *= digit;
                flag = true;
            }
            n /= 10;
        }
        if (flag) {
            System.out.println("Product of non-zero digits: " + product);
        } else {
            System.out.println("No non-zero digits found.");
        }
    }
}