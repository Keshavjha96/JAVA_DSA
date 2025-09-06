package BinarySearch;

public class maxcountofpos_negintegers {
    public static void main(String[] args) {
        int [] arr={-5,-4,-3,-2,-1,0,0,0,1,2,6,7,8,9,10};
        int n=arr.length;
        int result=search(arr,n);
        System.out.println(result);
    }

    private static int search(int[] arr, int n) {
        int lo=0,hi=arr.length-1;
        int neg_count=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]>=0)hi=mid-1;
            else lo=mid+1;
        }
        neg_count=lo;

        lo=0;
        hi=arr.length-1;
        int pos_count=0;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]<=0)lo=mid+1;
            else hi=mid-1;
        }
        pos_count=n-lo;
        return Math.max(neg_count,pos_count);
    }
}
