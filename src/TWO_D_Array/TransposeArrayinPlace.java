package TWO_D_Array;
import java.util.Scanner;
//ONLY FOR SQUARE MATRIX
public class TransposeArrayinPlace {
    public static void printMatrix(int[][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
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
        System.out.println("Enter rows and column of Matrix 1:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] matrix=new int[r][c];
        System.out.println("Enter Matrix elements:");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        printMatrix(matrix);
        System.out.println("Transpose of Matrix :");
        transposeinplace(matrix,r,c);
        printMatrix(matrix);
    }
}
