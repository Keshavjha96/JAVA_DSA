package Strings;

public class ReverseSb {
    public static void main(String[] args) {
        String s="Keshav";
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        s=sb.toString();
        System.out.println(s);
        //sb.reverse();
        sb.deleteCharAt(0);
        sb.insert(1,'o');
        sb.delete(4,6);
//        int i=0,j=sb.length()-1;
//        while(i<=j){
//            char temp1=sb.charAt(i);
//            char temp2=sb.charAt(j);
//            sb.setCharAt(i,temp2);
//            sb.setCharAt(j,temp1);
//            i++;
//            j--;
//        }
      System.out.println(sb);
    }
}
