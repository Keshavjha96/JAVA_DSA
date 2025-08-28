package TWO_D_Array;
import java.util.Scanner;
public class RotateMatrixninetydegree {
    public static void printMatrix(int[][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void reverseArray(int[] arr){
        int i=0,j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void rotate(int[][] matrix,int n){
        //transpose
        //reverse of transopse
        transposeinplace(matrix,n,n);
        //Reversed each row of transposed matrix
        for (int i=0;i<n;i++){
            reverseArray(matrix[i]);
        }
    }
    public static void transposeinplace(int[][] matrix,int r,int c){
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of Rows:");
            int r=sc.nextInt();
            System.out.println("Enter no of Columns:");
            int c=sc.nextInt();
            int[][]  matrix=new int[r][c];
            System.out.println("Enter " +r*c+ " Elements");
            for (int i=0;i<r;i++){
                for (int j=0;j<c;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
        System.out.println("Matrix:");
            printMatrix(matrix);
            rotate(matrix,r);
        System.out.println("Rotated Matrix:");
        printMatrix(matrix);


    }
}
