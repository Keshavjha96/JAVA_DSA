package Arrays;

public class SecondlargestinArray {
    public static void main(String[] args) {
        int[] arr={2,56,7,84,4,3};
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max) max=arr[i];{
            }
        }
        int smax=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>smax && arr[i]!=max)
            smax=arr[i];

        }
        System.out.println(max);
        System.out.println(smax);
    }
}
