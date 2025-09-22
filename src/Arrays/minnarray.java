package Arrays;

public class minnarray {
    public static void main(String[] args) {
        int arr[]={2,-3,5,6,7,-23};
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min) min=arr[i];
        }
        System.out.println(min);
    }
}
