package Conditionals;
import java.util.Scanner;
public class divisibleby3or5 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        if (n%3==0 || n%5==0){
            System.out.println("The number is divisible by 3 0r 5");
        }
        else{
            System.out.println("Neither divisible by 3 0r 5");
        }
    }
}
