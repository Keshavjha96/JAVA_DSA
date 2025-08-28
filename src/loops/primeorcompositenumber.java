package loops;
import java.util.Scanner;
public class primeorcompositenumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        boolean flag=false;//false means prime
        for (int i=2;i<n;i++){
            if (n%i==0){ //i is factor of n
                flag=true;//true is composite number
                break;
            }
        }
        if (n==1){
            System.out.println("Neither prime nor composite");
        }
       else if (flag==false){
            System.out.println("Prime number");
        }
        else {
            System.out.println("Composite number");
        }
    }
}
