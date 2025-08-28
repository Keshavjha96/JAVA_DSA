package Strings;
import java.util.*;
public class builder {
    public static void main(String[] args) {
//        StringBuilder str=new StringBuilder("hello");
//        str.append("world");
//        System.out.println(str);
//        str.setCharAt(0,'m');
//        System.out.println(str);
//        str.insert(2,'y');
//        System.out.println(str);
//        str.deleteCharAt(0);
//        System.out.println(str);
        StringBuilder sb=new StringBuilder("Physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0,7);
        System.out.println(sb);

    }
}
