package com.drive;
public class PeakElement {

    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // The peak element is on the right side
                left = mid + 1;
            } else {
                // The peak element is on the left side or it could be the mid element
                right = mid;
            }
        }

        // At the end of the loop, left and right will be pointing to the peak element
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int peak = findPeakElement(nums);
        System.out.println("Peak element: " + peak);
    }
}