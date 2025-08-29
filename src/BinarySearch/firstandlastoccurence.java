package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;
public class firstandlastoccurence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 5, 8, 9, 0, 7, 3, 3, 4, 5};
        int x=5;
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> result=binarysearch(arr,x);
        System.out.println("First and last occurencs of"+x+result);

    }

    public static ArrayList<Integer> binarysearch(int[] arr, int x) {
    ArrayList<Integer> ans=new ArrayList<>();
    int lo=0,hi=arr.length-1,idx=-1;
    while (lo<=hi){
        int mid=(lo+hi)/2;
        if (arr[mid]<x)lo=mid+1;
        else if(arr[mid]>x)hi=mid-1;
        else {
            idx=mid;
            hi=mid-1;
        }
    }
    ans.add(idx);

    lo=0;
    hi=arr.length-1;
    idx=-1;
    while(lo<=hi){
        int mid=(lo+hi)/2;
        if(arr[mid]<x)lo=mid+1;
        else if (arr[mid]>x)hi=mid-1;
        else {
            idx=mid;
            lo=mid+1;
        }
    }
    ans.add(idx);
        return ans;
    }
}