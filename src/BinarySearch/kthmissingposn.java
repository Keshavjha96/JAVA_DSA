package BinarySearch;

class kthmissingpos{
    public static int kthMissing(int[] arr, int k) {
        int n=arr.length;
        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int correctNo=mid+1;    // it is the correct value at mid
            int missing=arr[mid]-correctNo;
            if(missing>=k) hi=mid-1;
            else lo=mid+1;
        }
        return hi+1+k;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int k = 5;
        int result = kthMissing(arr, k);
        System.out.println(result);
    }
}