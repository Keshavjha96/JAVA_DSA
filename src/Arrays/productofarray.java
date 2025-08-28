package Arrays;

public class productofarray {
    public static void main(String[] args) {
        int [] arr={2,4,8,12};
        int product=1;
        for (int i=0;i<arr.length;i++){
            product*=arr[i];
        }
        System.out.println(product);
    }
}
