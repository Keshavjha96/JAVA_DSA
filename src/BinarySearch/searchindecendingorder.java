package BinarySearch;
import java.util.*;
public class searchindecendingorder {
    public static void main(String[] args) {
        int [] arr={100,91,87,76,66,52,43,35,29,13,5};
        int tar=29;
        int result=search(arr,tar);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
    public static int search(int [] arr,int tar){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid=(hi+lo)/2;
            if (arr[mid] == tar) {
                return mid;
            }
            if (arr[mid]>tar)lo=mid+1;
            else if (arr[mid]<tar)hi=mid-1;
        }
        return -1;
    }
}
