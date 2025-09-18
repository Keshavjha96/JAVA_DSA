package Multidimensionalarrays;

public class ForeachLoop {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 5, 7},{5, 8, 9, 10},{9, 12, 1, 3}};
        for (int i=0;i<arr.length;i++){
            for (int ele:arr[i]){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
