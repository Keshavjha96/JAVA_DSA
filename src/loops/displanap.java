package loops;
import java.util.Scanner;
public class displanap {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n=sc.nextInt();
        //1,3,5,7,9
//        for (int i=1;i<=(2*n-1);i+=2){
//            System.out.print(i+" ");
//        }


        //4,7,10,13,16....3n+1 method 1
//        for (int i=4;i<=3*n+1;i+=3){
//            System.out.print(i+" ");
//        }
        int a=4,d=5;
        for (int i=1;i<=n;i++){
            System.out.print(a+" ");
            a+=d;
        }
    }
}
