package Recursion;

import java.util.Scanner;

public class Oneton {
    static int n;
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            n=sc.nextInt();
            print(1);
    }
    public static void print(int x){
        if (x>n) return;
        System.out.println(x);
        print(x+1);
    }
//    public static void print(int x,int n){
//        if (x>n) return;
//        System.out.println(x);
//        print(x+1,n);
// }
}
