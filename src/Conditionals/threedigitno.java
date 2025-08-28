package Conditionals;
import java.util.Scanner;
public class threedigitno {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Ente a number:");
            int n= sc.nextInt();
            if (n>99 && n<1000){
                System.out.println("This is a three digit number");
            }
            else{
                System.out.println("It is not a three digit number");
            }
    }
}
