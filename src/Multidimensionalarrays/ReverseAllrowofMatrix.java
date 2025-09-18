package Multidimensionalarrays;

public class ReverseAllrowofMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5, 7},{5, 8, 9, 10},{9, 12, 1, 3}};
        for (int i=0;i<arr.length;i++){
            for (int j=arr[0].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
