package Conditionals;
import java.util.Scanner;
public class sideoftriangles {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter first side:");
        int a= sc.nextInt();
        System.out.println("Enter second side:");
        int b= sc.nextInt();
        System.out.println("Enter third side:");
        int c= sc.nextInt();
        if (a+b>c && b+c>a && c+a>b){
            System.out.println("Vaild triengle");
        }
        else {
            System.out.println("Invalid triangle");
        }
    }
}
