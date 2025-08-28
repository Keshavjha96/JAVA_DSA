package javainput;
import java.util.Scanner;
public class areacirclewithinput {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius:");
        int radius;
        radius= sc.nextInt();
        double pi=3.14;
        double area=pi*radius*radius;
        System.out.println("Area of the circle is:"+area);

    }
}
