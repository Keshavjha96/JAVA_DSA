package Multidimensionalarrays;

public class outputin2Darrays {
    public static void main(String[] args) {
//        int[][] arr=new int[3][4];
        int[][] arr={{2,6,7,8},{7,2,0,6},{4,3,2,1}};
        System.out.println(arr.length+" "+arr[0].length);
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
