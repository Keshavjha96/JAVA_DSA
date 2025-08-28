package Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr ={3,4,66,7,9,60,40};
        int max=-Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max)max=arr[i];
        }
        System.out.println(max);
    }
}
