package Multidimensionalarrays;

public class Maxelementin2Darray {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{3,4,6,9},{9,24,55,9}};
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                if (arr[i][j]>max)
                    max=arr[i][j];
            }
        }
        System.out.println(max);
    }
}
