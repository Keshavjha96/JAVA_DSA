package Recursion;

public class GlobalVariable {
    static int x=10;
    public static void main(String[] args) {
        fun();
       x=9;//change
        System.out.println(x);
        int x=4;
        System.out.println(x);
    }
    public static void fun(){
        x=20;
        int x=6;
        System.out.println(x);
    }
}
