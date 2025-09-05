package BinarySearch;

import java.util.Scanner;

public class Squareroott { public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n :");
    int n= sc.nextInt();
    int ans= mySqrt(n);
    System.out.println(ans);
}
    public static int mySqrt(int n) {
        long lo=0,hi=n;
        while(lo<=hi){
            long mid=(lo+hi)/2;
            if(mid*mid == n) return (int)mid;
            else if(mid*mid>n) hi=mid-1;
            else lo=mid+1;
        }
        return (int)hi;

    }
}
