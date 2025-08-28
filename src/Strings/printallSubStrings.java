package Strings;
import java.util.*;
public class printallSubStrings {
    public static void main(String[] args) {
        String str="abcd";
        for (int i=0;i<=3;i++){
            for (int j=0;j<=4;j++){
                System.out.println(str.substring(i,j)+" ");
            }
        }
    }
}
