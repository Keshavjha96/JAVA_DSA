package Recursion;

import java.util.Scanner;

public class PowerLiner {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base: ");
        int a=sc.nextInt();
        System.out.println("Enter Exponent: ");
        int b=sc.nextInt();
        System.out.println(a+" raised to the power "+b+" is "+pow(a,b));
    }
    public static int pow(int a,int b){
        if(b==0) return 1;
        if(b%2==0) return pow(a,b/2)*pow(a,b/2);
        else return a*pow(a,b/2)*pow(a,b/2);
    }
//    public static int pow(int a,int b){
//        if (b==0) return 1;
//        return a*pow(a,b-1);
//    }
}
