package Strings;

import java.util.Locale;
import java.util.Scanner;

public class changethestring {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        String result=changeString(s);
        System.out.println(result);
    }
    static String changeString(String s){
    if(s.length()==0)return s;

    if(Character.isLowerCase(s.charAt(0))){
            return s.toLowerCase();
        }
        else{
            return s.toUpperCase();
        }
    }
}
