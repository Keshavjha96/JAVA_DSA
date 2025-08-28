package javainput;
import java.util.Scanner;
public class sumoftwonumberinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int x= sc.nextInt();
        System.out.print("Enter second number:");
        int y=sc.nextInt();
        int sum=x+y;
        System.out.println("The sum is:"+sum);
    }
}
