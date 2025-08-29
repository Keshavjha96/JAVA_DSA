package BinarySearch;

import java.util.Arrays;

public class Findindexoftarget {

    public static void main(String[] args) {
        int[] arr={2,4,1,1,7,8,9,0};
        int tar=1;
        Arrays.sort(arr);
        int result=binarysearch(arr,tar);
        if (result!=-1){
            System.out.println("Element "+tar+" isfound at index "+result);
        }
        else System.out.println("Element "+tar+" not found");
    }
        public static int binarysearch(int[] arr, int tar) {
            int lo=0,hi=arr.length-1,idx=-1;
            while(lo<=hi){
                int mid=(lo+hi)/2;
                if(arr[mid]>tar)hi=mid-1;
                else if(arr[mid]<tar)lo=mid+1;
                else {//arr[mid]=idx
                    idx=mid;
                    hi=mid-1;
                }

            }
            return idx;
        }
    }
