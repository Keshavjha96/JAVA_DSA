package loops;
import java.util.Scanner;
public class sumofevendigits {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int sum=0;
        boolean flag=false;//digits are odd
        while(n!=0){
            int lastdigit=n%10;
            if (n%2==0){
            sum+=lastdigit;
            flag=true;
            }
            n/=10;
        }
       if (flag==true){
           System.out.println(sum);
       }
       else{
           System.out.println("No even digits found");
       }
    }
}
