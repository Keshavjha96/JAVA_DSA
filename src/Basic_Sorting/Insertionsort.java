package Basic_Sorting;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr={2,3,8,9,7,4,1};
        int n=arr.length;
        for (int i=0;i<n;i++){
            int j=i;
            while(j<0 && arr[j]<arr[i]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for (int ele :arr){
            System.out.print(ele+" ");
        }
    }
}
