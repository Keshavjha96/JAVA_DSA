package Conditionals;
import java.util.Scanner;
public class nestetthreeorfivenotfifteen {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
//        if (n%5==0 || n%3==0){
//            if (n%15!=0){
//                System.out.println("The number is divisible by 3 or 5 but not fifteen");
//            }
//            else {
//                System.out.println("Not matching the required condition");
//            }
//        }
//        else {
//            System.out.println("Not matching the required condition");
//        }
        if (n%15!=0 && (n%3==0 || n%5==0)){
            System.out.println("Not matching the required condition");
        }
        else {
            System.out.println("Not matching the required condition");
        }
    }
}
