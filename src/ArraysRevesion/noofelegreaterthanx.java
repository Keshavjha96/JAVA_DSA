package ArraysRevesion;

public class noofelegreaterthanx {
    public static void main(String[] args) {
        int [] arr={12,45,67,88,33,22};
        int count=0;
        int x=7;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>x){
                count++;
            }
        }
        System.out.println(count);
    }
}
