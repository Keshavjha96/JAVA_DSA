package Conditionals;
import java.util.Scanner;
public class youngestofthree {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Ram:");
        int a=sc.nextInt();
        System.out.print("Enter age of shyam:");
        int b= sc.nextInt();
        System.out.print("Enter age of ajay:");
        int c= sc.nextInt();
        if (a<b){
            if (a<c){
                System.out.println("Ram is youngest");
            }
            else {
                System.out.println("ajay is youngest");
            }
        }
        else {
            if (b<a){
                System.out.println("shyam is youngest");
            }
            else {
                System.out.println("ajay is youngest");
            }
    }

    }
}
