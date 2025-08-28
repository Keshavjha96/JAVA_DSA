package Arrays;
import java.util.Arrays;
public class sortarraybuiltin {
    public static void main(String[] args) {
        //sort=Ascending order
        int [] arr={4,-5,32,3,9};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
