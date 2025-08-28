package javainput;
import java.util.Scanner;
public class squareofnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x= sc.nextInt();
        int square=x*x;
        System.out.println("Square of number is:"+square);
    }
}
