package Arrays;

public class multiplyoddelmentbytwo {
    public static void main(String[] args) {
        int [] arr={2,4,7,8,9};
print(arr);
        for (int i=0;i<arr.length;i++){
            if (i%2!=0) arr[i]+=10;
            else arr[i]*=2;
        }
        print(arr);
    }
    public static void print(int[] arr){

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
