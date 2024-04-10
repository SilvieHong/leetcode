//https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
class Solution {
    public int maximumCount(int[] nums) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            position = binarySearch(nums);
        }

        int negative = position;
        int positive = nums.length - position;
        
        for (int i = position; i < nums.length; i++) {
            if (nums[i] == 0) {
                positive--;
            } else {
                break;
            }
        }
        return Math.max(negative, positive);
    }

    private static int binarySearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return nums[left] >= 0 ? left: left + 1;
    }
}

/**
 * Complexity:
 * Time:O(nlogn) and Space:O(1)
 */
