package TWO_D_Array;
import java.util.Scanner;
public class teodarrayinitilasation {
    public static void printArray(int[][] arr){
        for (int i=0;i<arr.length;i++){//row
        //    System.out.println(arr[i]);
            for (int j=0;j<arr.length;j++){//column
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of Rows:");
            int r=sc.nextInt();
        System.out.println("Enter no of Columns:");
        int c=sc.nextInt();
        int[][] arr2=new int[r][c];
        System.out.println("Enter " +r*c+ " Elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
     //   int[][] arr2={{3,4,5},{45,67,75},{5,7,8}};
        printArray(arr2);
    }
}
