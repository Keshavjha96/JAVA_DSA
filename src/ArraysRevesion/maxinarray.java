package ArraysRevesion;

public class maxinarray {
    public static void main(String[] args) {
        int [] arr={12,3,4,56,7,8,65};
        int max= Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max) max=arr[i];
        }
        System.out.println(max);
    }
}
