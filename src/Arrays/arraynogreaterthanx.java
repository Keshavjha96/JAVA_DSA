package Arrays;

public class arraynogreaterthanx {
    public static void main(String[] args) {
        int[] arr={34,2,35,67,88,5,54,98};
        int x=8;
        int count=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
}
