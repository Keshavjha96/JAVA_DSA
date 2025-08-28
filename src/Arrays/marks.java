package Arrays;

public class marks {
    public static void main(String[] args) {
        int[] marks={90,34,56,66,58,32,49,7};
        for (int i=0;i<marks.length;i++){
            if (marks[i]<35){
                System.out.println(i+" ");
            }
        }
    }
}
