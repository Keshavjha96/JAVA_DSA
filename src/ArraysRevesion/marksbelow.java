package ArraysRevesion;

public class marksbelow {
    public static void main(String[] args) {
        int [] marks={70,23,56,3,2,4,6,90};
        for (int i=0;i<marks.length;i++){
            if (marks[i]<35){
                System.out.print(i+" ");
            }
        }
    }
}
