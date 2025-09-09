package Strings;

import java.util.Scanner;

public class palidron {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean result = isPalindrome(s);
        System.out.println(result);
    }

    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i<=j) {
            if (s.charAt(i)!=s.charAt(j)) return  false;{
                i++;
                j--;
            }
        }
       return true;
    }
}