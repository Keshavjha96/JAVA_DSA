package Recursion;

public class PreinPost {
    public static void main(String[] args) {
        pip(3);
    }
    private static void pip(int n) {
        if (n==0) return;
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
    }
}
