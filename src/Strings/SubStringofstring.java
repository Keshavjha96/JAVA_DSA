package Strings;

public class SubStringofstring {
    public static void main(String[] args) {
        String s = "gopi";
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                System.out.print(s.substring(i,j+1)+" ");
            }
            System.out.println();
        }
    }
}
