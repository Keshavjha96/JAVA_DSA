package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class deepcopyshallowcopy {
    public static void main(String[] args) {
        int [] arr={2,3,5,6};
//        int[] x=arr;//x is a shallow copy
//        x[0]=10;
        int[] y= Arrays.copyOf(arr,arr.length);//deep copy
        y[0]=10;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
}
