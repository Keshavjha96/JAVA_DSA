package ArraysRevesion;

public class secondmax {
    public static void main(String[] args) {
        int[] arr={24,45,77,88,99,54,66,23};
        int max= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max) max=arr[i];
        }
        int smax= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>smax && arr[i]!=max) smax=arr[i];
        }
        System.out.println(smax);
    }
}
