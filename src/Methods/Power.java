package Methods;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            System.out.println(Math.pow(a,b));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.max(6,7));
        System.out.println(Math.cbrt(9));
        System.out.println(Math.abs(-8));
        System.out.println(Math.floor(-3.14));
        System.out.println(Math.max(4,8));
        System.out.println(Math.min(8,9));
        int x=6,y=9,z=10;
        System.out.println(Math.max(x,Math.max(y,z)));
    }
}
