package Recursion;

public class RecursionOnArray {
    public static void main(String[] args) {
        int[] arr={5,6,8,9,4,3,10};
        recPrint(arr,0);
    }
    public static void recPrint(int[] arr,int idx){
        if(idx==arr.length)return;
        System.out.print(arr[idx]+" ");
        recPrint(arr,idx+1);
    }
}
