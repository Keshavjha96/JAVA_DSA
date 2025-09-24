package Recursion;

import java.util.Scanner;

public class PowerLiner {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base: ");
        int a=sc.nextInt();
        System.out.println("Enter Exponent: ");
        int b=sc.nextInt();
        System.out.println(a+" raised to the power "+b+" is "+Math.pow(a,b));
    }
}
