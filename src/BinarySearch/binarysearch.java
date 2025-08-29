package BinarySearch;

import java.util.Arrays;

public class binarysearch {
    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 8, 9, -3, 1};
        int target = 2;
        // Binary search requires sorted array
        Arrays.sort(nums);
        int result = search(nums, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }

    // Made it static so we can call directly from main
    public static int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
}
