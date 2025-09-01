package BinarySearch;
import java.util.*;
public class peakindexinmountainarray {
    public static void main(String[] args) {
        int[] arr={1,3,5,8,6,2,-1,-2};
        int result=peakIndex(arr);
        System.out.println("Peak index is found at index "+result);
    }
        public static int peakIndex(int[] arr) {
            int lo=1,hi=arr.length-2;
            while(lo<=hi){
                int mid=(lo+hi)/2;
                if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
                    return mid;
                else if (arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1])
                    lo=mid+1;
                else hi=mid-1;
            }
            return 92992;
        }
    }

