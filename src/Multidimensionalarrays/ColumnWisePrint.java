package Multidimensionalarrays;

public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5, 7},{5, 8, 9, 10},{9, 12, 1, 3}};
        for (int j=0;j<arr[0].length;j++){
            for (int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
