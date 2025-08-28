package TWO_D_Array;

import java.util.Scanner;

public class Printspiral {
    public static void printMatrix(int[][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
static void printspiralorder(int[][] matrix,int r,int c){
        int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
        int totalelements=0;
        while (totalelements<r*c){
            //top row->leftcol to right col
         for (int j=leftCol;j<=rightCol && totalelements<r*c;j++){
             System.out.print(matrix[topRow][j]+" ");
             totalelements++;
         }
         topRow++;
            //right column->top row to bottom row
            for (int i=topRow;i<=bottomRow && totalelements<r*c;i++){
                System.out.print(matrix[i][rightCol]+" ");
                totalelements++;
            }
            rightCol--;
            //bottom row->right colum to left column
            for (int j=rightCol;j>=leftCol && totalelements<r*c;j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalelements++;
            }
            bottomRow--;
            //left column->bottom row to top row
            for (int i=bottomRow;i>=topRow && totalelements<r*c;i--){
                System.out.print(matrix[i][leftCol]+" ");
                totalelements++;
            }
            leftCol++;
        }

}

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no of Rows:");
    int r = sc.nextInt();
    System.out.println("Enter no of Columns:");
    int c = sc.nextInt();
    int[][] matrix= new int[r][c];
    System.out.println("Enter " + r * c + " Elements");
    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            matrix[i][j] = sc.nextInt();
        }
    }
        System.out.println("Input Matrix:");
    printMatrix(matrix);
        System.out.println("Spiral Order:");
        printspiralorder(matrix,r,c);

}
}
