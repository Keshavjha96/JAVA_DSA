package Recursion;

public class SearchOfElement {
    public static void main(String[] args) {
        int[] arr={2,34,8,6,55,33,11,94};
        int target=94;
        System.out.println(exists(arr, target,0));
    }
    public static boolean exists(int[] arr, int target, int idx){
        if (idx==arr.length)return false;
      if(arr[idx]==target)return true;
        return exists(arr,target,idx+1);
    }
}
