package Strings;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        System.out.println(s.length()+" "+s.capacity());
        s.append("Keshav");
        System.out.println(s.length()+" "+s.capacity());
        System.out.println(s);
        s.setCharAt(1,'S');
        System.out.println(s);
    }
}
