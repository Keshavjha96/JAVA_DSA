package Arrays;

public class reverseinarray {
    public static void print(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6};
     int n=arr.length;
     print(arr);
     int i=0,j=n-1;
     while (i<j){
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;
         j--;
     }
     print(arr);
    }
}
