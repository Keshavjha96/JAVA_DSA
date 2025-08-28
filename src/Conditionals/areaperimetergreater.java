package Conditionals;
import java.util.Scanner;
public class areaperimetergreater {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int length =sc.nextByte();
        System.out.println("Enter breadth:");
        int breadth=sc.nextInt();
        int area=length*breadth;
        int perimeter= 2*(length+breadth);
        if (area>perimeter){
            System.out.println("Area is greater than perimeter");
        }
        else if (area<perimeter){
            System.out.println("Perimeter is greater than area");
        }
        else {
            System.out.println("Area is equal to perimeter");
        }
    }
}
