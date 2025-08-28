package Methods;
import java.util.Scanner;
public class minoffourno {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a= sc.nextInt();
        System.out.print("Enter b:");
        int b= sc.nextInt();
        System.out.print("Enter c:");
        int c=sc.nextInt();
        System.out.print("Enter d:");
        int d= sc.nextInt();
        System.out.println(Math.min(a,Math.min(b,Math.min(c,d))));
    }
}
