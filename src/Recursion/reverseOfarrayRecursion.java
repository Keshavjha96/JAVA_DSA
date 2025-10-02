package Recursion;

public class reverseOfarrayRecursion {
    public static void main(String[] args) {
        int[] arr={5,6,8,9,4,3,10};
        recPrint(arr,0);
    }
    public static void recPrint(int[] arr,int idx){
        if(idx==arr.length)return;
        recPrint(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
}
